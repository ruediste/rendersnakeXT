package com.github.ruediste.rendersnakeXT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

import com.github.ruediste.html5.std.HtmlAttribute;
import com.github.ruediste.html5.std.HtmlElement;
import com.github.ruediste.html5.std.HtmlStandard;
import com.github.ruediste.html5.std.parser.Parser;

/**
 * Generate the HTML API
 */
public class Generator {
    public static void main(String[] args) throws Throwable {
        new Generator().generate();
    }

    public void generate() throws Throwable {
        HtmlStandard std = new Parser().parse(getClass().getResourceAsStream(
                "index.html"));

        OutputStreamWriter out = openWriter("Html5Canvas");
        generateTags(std, out);
        generateAttrs(std, out);
    }

    private void generateAttrs(HtmlStandard std, OutputStreamWriter out)
            throws Throwable {
        // out.write("package com.github.ruediste.rendersnakeXT.canvas;\n"
        // +
        // "public interface Html5Attributes<TAttr> extends HtmlAttributes<TAttr> {\n");

        HashSet<String> seenAttributes = new HashSet<>();
        seenAttributes.add("class"); // suppress generation of the class
                                     // attribute
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
        out.write("}\n" + "");
        out.close();
    }

    private void generateAttribute(OutputStreamWriter out, HtmlAttribute attr)
            throws IOException {
        String escapedName = escapeToFunctionName(attr.name.toUpperCase());
        out.write("/** " + attr.description + "*/\n");
        out.write("    default TSelf " + escapedName + "(String " + escapedName
                + ") {\n" + "        return addAttribute(\"" + attr.name
                + "\", " + escapedName + ");\n" + "    }\n");
    }

    private void generateTags(HtmlStandard std, OutputStreamWriter out)
            throws Throwable {

        out.write("package com.github.ruediste.rendersnakeXT.canvas;\n"
                + "import java.util.function.Function;\n"
                + "public interface Html5Canvas<TSelf extends Html5Canvas<TSelf>>\n"
                + "        extends HtmlCanvas<TSelf> {\n");

        HashSet<String> seenTags = new HashSet<>();
        for (HtmlElement element : std.elements) {
            if (!seenTags.add(element.tag))
                continue;
            String escapedTag = escapeToFunctionName(element.tag);
            out.write("/** " + element.description + "*/\n");
            out.write("    default TSelf " + escapedTag + "() {\n"
                    + "        return tag(\"" + element.tag + "\");\n"
                    + "    }\n" + "\n");
            out.write("    default TSelf _" + escapedTag + "() {\n"
                    + "        return close(\"" + element.tag + "\");\n"
                    + "    }\n");
        }
        // out.write("}\n");
        // out.close();
    }

    private OutputStreamWriter openWriter(String className) throws Throwable {
        String fileName = getClass().getName();
        fileName = fileName.substring(0, fileName.length()
                - getClass().getSimpleName().length());
        fileName = fileName.replace(".", "/");
        fileName = "src/main/java/" + fileName + "canvas/";
        fileName = fileName + className + ".java";
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(
                fileName), "UTF-8");
        return out;
    }

    HashSet<String> escapedWords = new HashSet<>(Arrays.asList("class",
            "default", "for"));

    String escapeToFunctionName(String tag) {
        tag = tag.replace("-", "_");
        if (escapedWords.contains(tag))
            tag = tag + "_";
        return tag;
    }
}
