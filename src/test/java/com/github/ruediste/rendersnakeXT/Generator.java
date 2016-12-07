package com.github.ruediste.rendersnakeXT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

import com.github.ruediste.html5.std.BooleanAttributeType;
import com.github.ruediste.html5.std.HtmlAttribute;
import com.github.ruediste.html5.std.HtmlElement;
import com.github.ruediste.html5.std.HtmlStandard;
import com.github.ruediste.html5.std.InputType;
import com.github.ruediste.html5.std.parser.Parser;

/**
 * Generate the HTML API
 */
public class Generator {
    public static void main(String[] args) throws Throwable {
        new Generator().generate();
    }

    public void generate() throws Throwable {
        HtmlStandard std = new Parser().parse(getClass().getResourceAsStream("index.html"));

        OutputStreamWriter out = openWriter("Html5Canvas");
        out.write("package com.github.ruediste.rendersnakeXT.canvas;\n"
                + "public interface Html5Canvas<TSelf extends Html5Canvas<TSelf>>\n"
                + "        extends Html5CanvasBase<TSelf> {\n");

        generateTags(std, out);
        generateAttrs(std, out);
        generateInputs(std, out);

        out.write("}\n" + "");
        out.close();
    }

    private void generateInputs(HtmlStandard std, OutputStreamWriter out) throws IOException {
        for (InputType type : std.inputTypes) {

            out.write("/** No End Tag Allowed! <br> Input element with type " + type.name + "<br> Data Type: "
                    + type.dataType + "<br> Control Type: " + type.controlType + " */\n");
            out.write("    default TSelf " + escapeToFunctionName("input_" + type.name) + "() {\n"
                    + "        return tagWithoutEndTag(\"input\").TYPE(\"" + type.name + "\");\n    }\n");
        }
    }

    private void generateAttrs(HtmlStandard std, OutputStreamWriter out) throws Throwable {

        HashSet<String> seenAttributes = new HashSet<>();
        seenAttributes.add("class"); // suppress generation of the class
                                     // attribute
        seenAttributes.add("content"); // having both content and CONTENT is
                                       // annoying
        for (HtmlAttribute attr : std.globalAttributes) {
            if (!seenAttributes.add(attr.name))
                continue;
            generateAttribute(out, attr);

        }
        for (HtmlElement element : std.elements) {
            for (HtmlAttribute attr : element.attributes) {
                if (!seenAttributes.add(attr.name))
                    continue;
                generateAttribute(out, attr);
            }
        }

    }

    private void generateAttribute(OutputStreamWriter out, HtmlAttribute attr) throws IOException {
        String escapedName = escapeToFunctionName(attr.name.toUpperCase());
        out.write("/** " + attr.description + "*/\n");
        if (attr.type instanceof BooleanAttributeType) {
            out.write("    default TSelf " + escapedName + "() {\n" + "        return addAttribute(\"" + attr.name
                    + "\", \"\");\n" + "    }\n");
        } else
            out.write("    default TSelf " + escapedName + "(String " + escapedName + ") {\n"
                    + "        return addAttribute(\"" + attr.name + "\", " + escapedName + ");\n" + "    }\n");
    }

    private void generateTags(HtmlStandard std, OutputStreamWriter out) throws Throwable {

        HashSet<String> seenTags = new HashSet<>();
        for (HtmlElement element : std.elements) {
            if (!seenTags.add(element.tag))
                continue;
            String escapedTag = escapeToFunctionName(element.tag);
            if (element.endTagOmissed) {
                out.write("/** No End Tag Allowed! <br>" + element.description + "*/\n");
                out.write("    default TSelf " + escapedTag + "() {\n" + "        return tagWithoutEndTag(\""
                        + element.tag + "\");\n    }\n");
            } else {
                out.write("/** " + element.description + "*/\n");
                out.write("    default TSelf " + escapedTag + "() {\n" + "        return tag(\"" + element.tag
                        + "\");\n" + "    }\n" + "\n");
                out.write("    default TSelf _" + escapedTag + "() {\n" + "        return close(\"" + element.tag
                        + "\");\n" + "    }\n");
            }
        }
    }

    private OutputStreamWriter openWriter(String className) throws Throwable {
        String fileName = getClass().getName();
        fileName = fileName.substring(0, fileName.length() - getClass().getSimpleName().length());
        fileName = fileName.replace(".", "/");
        fileName = "src/main/java/" + fileName + "canvas/";
        fileName = fileName + className + ".java";
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8");
        return out;
    }

    HashSet<String> escapedWords = new HashSet<>(Arrays.asList("class", "default", "for"));

    String escapeToFunctionName(String tag) {
        tag = tag.replace("-", "_");
        if (escapedWords.contains(tag))
            tag = tag + "_";
        return tag;
    }
}
