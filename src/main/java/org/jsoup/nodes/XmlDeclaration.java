package org.jsoup.nodes;

/**
 An XML Declaration.

 @author Jonathan Hedley, jonathan@hedley.net */
public class XmlDeclaration extends Node {
    private static final String DECL_KEY = "declaration";

    public XmlDeclaration(String data, String baseUri) {
        super(baseUri);
        attributes.put(DECL_KEY, data);
    }

    public String nodeName() {
        return "#declaration";
    }

    public String getWholeDeclaration() {
        return attributes.get(DECL_KEY);
    }

    // TODO: this munged <! and <? -- not really correct or useful
    public String outerHtml() {
        return String.format("<? %s >", getWholeDeclaration());
    }

    public String toString() {
        return outerHtml();
    }
}