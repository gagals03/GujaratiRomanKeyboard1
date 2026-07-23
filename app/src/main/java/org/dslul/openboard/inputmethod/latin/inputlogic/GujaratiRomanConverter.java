package org.dslul.openboard.inputmethod.latin.inputlogic;

public final class GujaratiRomanConverter {
    private GujaratiRomanConverter() {
    }

    public static String convert(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            final char ch = text.charAt(i);

            if (isIgnoredMark(ch)) {
                continue;
            }

            final String mapped = mapCharacter(ch);
            if (mapped != null) {
                result.append(mapped);
                continue;
            }

            result.append(ch);
        }
        return result.toString();
    }

    private static boolean isIgnoredMark(char ch) {
        return ch == '\u0A4D' || ch == '\u200C' || ch == '\u200D';
    }

    private static String mapCharacter(char ch) {
        switch (ch) {
            case '\u0A81':
            case '\u0A82':
            case '\u0A83':
                return "";

            case '\u0A85': return "a";
            case '\u0A86': return "aa";
            case '\u0A87': return "i";
            case '\u0A88': return "i";
            case '\u0A89': return "u";
            case '\u0A8A': return "u";
            case '\u0A8B': return "ri";
            case '\u0A8C': return "ri";
            case '\u0A8D': return "li";
            case '\u0A8E': return "li";
            case '\u0A8F': return "e";
            case '\u0A90': return "ai";
            case '\u0A93': return "o";
            case '\u0A94': return "au";

            case '\u0A95': return "k";
            case '\u0A96': return "kh";
            case '\u0A97': return "g";
            case '\u0A98': return "gh";
            case '\u0A99': return "ng";
            case '\u0A9A': return "ch";
            case '\u0A9B': return "chh";
            case '\u0A9C': return "j";
            case '\u0A9D': return "zh";
            case '\u0A9E': return "ny";
            case '\u0A9F': return "t";
            case '\u0AA0': return "th";
            case '\u0AA1': return "d";
            case '\u0AA2': return "dh";
            case '\u0AA3': return "n";
            case '\u0AA4': return "t";
            case '\u0AA5': return "th";
            case '\u0AA6': return "d";
            case '\u0AA7': return "dh";
            case '\u0AA8': return "n";
            case '\u0AAA': return "p";
            case '\u0AAB': return "ph";
            case '\u0AAC': return "b";
            case '\u0AAD': return "bh";
            case '\u0AAE': return "m";
            case '\u0AAF': return "y";
            case '\u0AB0': return "r";
            case '\u0AB2': return "l";
            case '\u0AB3': return "l";
            case '\u0AB5': return "v";
            case '\u0AB6': return "sh";
            case '\u0AB7': return "sh";
            case '\u0AB8': return "s";
            case '\u0AB9': return "h";

            case '\u0ABE': return "a";
            case '\u0ABF': return "i";
            case '\u0AC0': return "i";
            case '\u0AC1': return "u";
            case '\u0AC2': return "u";
            case '\u0AC3': return "r";
            case '\u0AC4': return "r";
            case '\u0AC5': return "e";
            case '\u0AC6': return "e";
            case '\u0AC7': return "e";
            case '\u0AC8': return "ai";
            case '\u0AC9': return "o";
            case '\u0ACA': return "o";
            case '\u0ACB': return "o";
            case '\u0ACC': return "au";

            default: return null;
        }
    }
}
