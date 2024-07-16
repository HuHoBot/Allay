package org.allaymc.codegen;

import com.squareup.javapoet.*;
import lombok.SneakyThrows;

import javax.lang.model.element.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.allaymc.codegen.Utils.convertToPascalCase;

/**
 * Allay Project 2023/4/8
 *
 * @author daoge_cmd
 */
public class VanillaBlockPropertyTypeGen {
    public static final BlockPropertyTypeFile BLOCK_PROPERTY_TYPE_INFO_FILE;
    public static final Path BLOCK_PROPERTY_TYPES_FILE = Path.of(CodeGen.DATA_PATH + "unpacked/block_property_types.json");
    private static final Path TYPE_DATA_PATH = Path.of("Allay-API/src/main/java/org/allaymc/api/data");
    private static final Path ENUM_PATH = Path.of("Allay-API/src/main/java/org/allaymc/api/block/property");
    private static final String PACKAGE_NAME = "org.allaymc.api.data";
    private static final String JAVA_DOC = """
            Automatically generated by {@code org.allaymc.codegen.VanillaBlockPropertyTypeGen}
            <p>
            Allay Project
                        
            @author daoge_cmd
            """;

    static {
        try {
            BLOCK_PROPERTY_TYPE_INFO_FILE = CodeGen.GSON.fromJson(Files.newBufferedReader(BLOCK_PROPERTY_TYPES_FILE), BlockPropertyTypeFile.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        generate();
    }

    @SneakyThrows
    public static void generate() {
        for (BlockPropertyTypeFile.BlockPropertyTypeInfo blockPropertyTypeInfo : BLOCK_PROPERTY_TYPE_INFO_FILE.propertyTypes.values()) {
            if (blockPropertyTypeInfo.valueType == BlockPropertyTypeFile.BlockPropertyType.ENUM) {
                generateEnumClass(blockPropertyTypeInfo);
            }
        }
        //generate VanillaBlockProperties.java
        TypeSpec.Builder codeBuilder = TypeSpec.interfaceBuilder("VanillaBlockPropertyTypes")
                .addJavadoc(JAVA_DOC)
                .addModifiers(Modifier.PUBLIC);
        var enumPropertyClass = ClassName.get("org.allaymc.api.block.property.type", "EnumPropertyType");
        var booleanPropertyClass = ClassName.get("org.allaymc.api.block.property.type", "BooleanPropertyType");
        var intPropertyClass = ClassName.get("org.allaymc.api.block.property.type", "IntPropertyType");
        for (var entry : BLOCK_PROPERTY_TYPE_INFO_FILE.propertyTypes.entrySet()) {
            var key = entry.getKey().toUpperCase();
            var blockPropertyTypeInfo = entry.getValue();
            var name = blockPropertyTypeInfo.serializationName;
            switch (blockPropertyTypeInfo.valueType) {
                case ENUM -> {
                    var enumClass = ClassName.get("org.allaymc.api.block.property.enums", blockPropertyTypeInfo.getEnumClassName());
                    codeBuilder.addField(
                            FieldSpec
                                    .builder(ParameterizedTypeName.get(enumPropertyClass, enumClass), key, Modifier.PUBLIC, Modifier.FINAL, Modifier.STATIC)
                                    .initializer("$T.of($S, $T.class, $T.values()[0])", enumPropertyClass, name, enumClass, enumClass)
                                    .build()
                    );
                }
                case BOOLEAN -> {
                    codeBuilder.addField(
                            FieldSpec
                                    .builder(booleanPropertyClass, key, Modifier.PUBLIC, Modifier.FINAL, Modifier.STATIC)
                                    .initializer("$T.of($S, $N)", booleanPropertyClass, name, blockPropertyTypeInfo.values.get(0))
                                    .build()
                    );
                }
                case INTEGER -> {
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    for (var value : blockPropertyTypeInfo.values) {
                        var intValue = Integer.parseInt(value);
                        if (intValue < min) {
                            min = intValue;
                        }
                        if (intValue > max) {
                            max = intValue;
                        }
                    }
                    codeBuilder.addField(
                            FieldSpec
                                    .builder(intPropertyClass, key, Modifier.PUBLIC, Modifier.FINAL, Modifier.STATIC)
                                    .initializer("$T.of($S, $L, $L, $L)", intPropertyClass, name, min, max, blockPropertyTypeInfo.values.get(0))
                                    .build()
                    );
                }
            }
        }
        var propertyClass = ClassName.get("org.allaymc.api.block.property.type", "BlockPropertyType");
        var listClass = ParameterizedTypeName.get(ClassName.get("java.util", "List"), ParameterizedTypeName.get(propertyClass, WildcardTypeName.subtypeOf(Object.class)));
        String paramStr = BLOCK_PROPERTY_TYPE_INFO_FILE.propertyTypes.keySet().stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        codeBuilder.addField(
                FieldSpec
                        .builder(listClass, "VALUES", Modifier.PUBLIC, Modifier.FINAL, Modifier.STATIC)
                        .initializer("List.of($N)", paramStr)
                        .build()
        );
        codeBuilder.addMethod(
                MethodSpec
                        .methodBuilder("values")
                        .returns(listClass)
                        .addStatement("return VALUES")
                        .addModifiers(Modifier.STATIC, Modifier.PUBLIC)
                        .build()
        );
        var javaFile = JavaFile.builder(PACKAGE_NAME, codeBuilder.build())
                .indent(Utils.INDENT)
                .skipJavaLangImports(true)
                .build();
        Files.writeString(TYPE_DATA_PATH.resolve("VanillaBlockPropertyTypes.java"), javaFile.toString());
    }

    @SneakyThrows
    protected static void generateEnumClass(BlockPropertyTypeFile.BlockPropertyTypeInfo info) {
        var enumName = info.getEnumClassName();
        TypeSpec.Builder enumBuilder = TypeSpec.enumBuilder(enumName)
                .addJavadoc(JAVA_DOC)
                .addModifiers(Modifier.PUBLIC);
        for (var value : info.values) {
            enumBuilder.addEnumConstant(value.toUpperCase());
        }

        var path = ENUM_PATH.resolve("enums/" + enumName + ".java");
        if (Files.exists(path)) Files.delete(path);

        var javaFile = JavaFile.builder("org.allaymc.api.block.property.enums", enumBuilder.build())
                .indent(Utils.INDENT)
                .skipJavaLangImports(true)
                .build();
        Files.writeString(path, javaFile.toString());
    }

    public static class BlockPropertyTypeFile {
        Map<String, BlockPropertyTypeInfo> propertyTypes;
        List<String> differentSizePropertyTypes;
        Map<String, Map<String, String>> specialBlockTypes;

        protected enum BlockPropertyType {
            BOOLEAN,
            INTEGER,
            ENUM
        }

        public static class BlockPropertyTypeInfo {
            String serializationName;
            BlockPropertyType valueType;
            List<String> values;

            public String getEnumClassName() {
                //minecraft:cardinal_direction WTF???
                return convertToPascalCase(serializationName.replace(":", "_"));
            }

            public String getConstantValueName() {
                return serializationName.replace(":", "_").toUpperCase();
            }
        }
    }
}
