package com.example.demo1.utils;

public abstract class encoding {
    public static String escapeHtml(String rawHtml) {
        int rawHtmlLength = rawHtml.length();
        // add 30% for additional encodings
        int capacity = (int) (rawHtmlLength * 1.3);
        StringBuilder sb = new StringBuilder(capacity);
        for (int i = 0; i < rawHtmlLength; i++) {
            char ch = rawHtml.charAt(i);
            if (ch == '<') {
                sb.append("&lt;");
            } else if (ch == '>') {
                sb.append("&gt;");
            } else if (ch == '"') {
                sb.append("&quot;");
            } else if (ch == '&') {
                sb.append("&amp;");
            } else if (ch < ' ' || ch == '\'') {
                // non printable ascii symbols escaped as numeric entity
                // single quote ' in html doesn't have &apos; so show it as numeric entity &#39;
                sb.append("&#").append((int)ch).append(';');
            } else {
                // any non ASCII char i.e. upper than 127 is still UTF
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}


