package org.allaymc.codegen;

import com.google.gson.JsonParser;
import com.squareup.javapoet.*;
import lombok.SneakyThrows;
import org.allaymc.dependence.StringUtils;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

/**
 * Allay Project 2023/5/20
 *
 * @author daoge_cmd
 */
public class VanillaEntityIdEnumGen {
    public static final ClassName API_IDENTIFIER_CLASS = ClassName.get("org.allaymc.api.utils", "Identifier");
    public static final ClassName DEP_IDENTIFIER_CLASS = ClassName.get("org.allaymc.dependence", "Identifier");
    public static final ClassName STRING_CLASS = ClassName.get("java.lang", "String");
    public static final ClassName GETTER_CLASS = ClassName.get("lombok", "Getter");
    static final Path ENTITY_ID_MAP_FILE_PATH = Path.of(CodeGen.DATA_PATH + "unpacked/entity_id_map.json");
    static final Map<String, Integer> ENTITY_ID_MAP = new TreeMap<>();
    private static final String PACKAGE_NAME = "org.allaymc.api.data";
    private static final String JAVA_DOC = """
            Automatically generated by {@code org.allaymc.codegen.VanillaEntityIdEnumGen} <br>
            Allay Project <p>
            @author daoge_cmd
            """;

    static {
        try {
            var reader = JsonParser.parseReader(Files.newBufferedReader(ENTITY_ID_MAP_FILE_PATH));
            reader.getAsJsonObject().entrySet().forEach(entry -> {
                var id = entry.getValue().getAsInt();
                ENTITY_ID_MAP.put(entry.getKey(), id);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        generate();
    }

    public static void generate() {
        generateTo(PACKAGE_NAME, Path.of("Allay-API/src/main/java/org/allaymc/api/data/VanillaEntityId.java"), API_IDENTIFIER_CLASS);
        generateTo("org.allaymc.dependence", Path.of("Allay-CodeGen/src/main/java/org/allaymc/dependence/VanillaEntityId.java"), DEP_IDENTIFIER_CLASS);
    }

    @SneakyThrows
    protected static void generateTo(String packageName, Path outPutPath, ClassName identifierClassName) {
        TypeSpec.Builder codeBuilder = TypeSpec.enumBuilder("VanillaEntityId")
                .addJavadoc(JAVA_DOC)
                .addModifiers(Modifier.PUBLIC)
                .addField(FieldSpec
                        .builder(identifierClassName, "identifier", Modifier.PRIVATE, Modifier.FINAL)
                        .addAnnotation(GETTER_CLASS)
                        .build())
                .addField(FieldSpec
                        .builder(int.class, "networkId", Modifier.PRIVATE, Modifier.FINAL)
                        .addAnnotation(GETTER_CLASS)
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addParameter(STRING_CLASS, "identifier")
                        .addParameter(int.class, "networkId")
                        .addStatement("this.$N = new $T($N)", "identifier", identifierClassName, "identifier")
                        .addStatement("this.$N = $N", "networkId", "networkId")
                        .build()
                );
        for (var entry : ENTITY_ID_MAP.entrySet()) {
            var valueName = StringUtils.fastTwoPartSplit(
                    entry.getKey(),
                    ":",
                    "")[1].toUpperCase();
            codeBuilder.addEnumConstant(valueName, TypeSpec.anonymousClassBuilder("$S, $L", entry.getKey(), entry.getValue()).build());
        }

        var javaFile = JavaFile.builder(packageName, codeBuilder.build())
                .indent(Utils.INDENT)
                .skipJavaLangImports(true)
                .build();
        Files.writeString(outPutPath, javaFile.toString());
    }
}
