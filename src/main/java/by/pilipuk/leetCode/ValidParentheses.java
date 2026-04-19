package by.pilipuk.leetCode;

public class ValidParentheses {
    public static boolean isValid(String s) {

        int kr = 0;
        int kv = 0;
        int fig = 0;

        for (int i = 0; i < s.length(); i++) {
            String symbol = String.valueOf(s.charAt(i));
            String nextSymbol = "";
            if (i != s.length() - 1) {
                nextSymbol = String.valueOf(s.charAt(i + 1));
            } else {
                nextSymbol = "";
            }
            switch (symbol) {
                case "(" -> {
                    if (nextSymbol.equals("]") || nextSymbol.equals("}") || nextSymbol.isEmpty()) {
                        kr = -10000;
                    } else {
                        kr -= 1;
                    }
                }
                case "[" -> {
                    if (nextSymbol.equals(")") || nextSymbol.equals("}") || nextSymbol.equals("")) {
                        kv = -10000;
                    } else {
                        kv -= 1;
                    }
                }
                case "{" -> {
                    if (nextSymbol.equals(")") || nextSymbol.equals("]") || nextSymbol.isEmpty()) {
                        fig = -10000;
                    } else {
                        fig -= 1;
                    }
                }
                case ")" -> kr += 1;
                case "]" -> kv += 1;
                case "}" -> fig += 1;
            }
        }
        if (kv == 0 && kr == 0 && fig == 0) {
            return true;
        } else {
            return false;
        }
    }
}
