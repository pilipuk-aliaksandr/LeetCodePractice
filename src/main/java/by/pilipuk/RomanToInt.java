package by.pilipuk;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = switch(s.charAt(i)) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            };
            if (i + 1 < s.length()) {
                int next = switch(s.charAt(i + 1)) {
                    case 'M' -> 1000;
                    case 'D' -> 500;
                    case 'C' -> 100;
                    case 'L' -> 50;
                    case 'X' -> 10;
                    case 'V' -> 5;
                    case 'I' -> 1;
                    default -> throw new IllegalStateException("Unexpected value: " + s.charAt(i + 1));
                };
                if (
                        (current == 1 && (next == 5 || next == 10)) ||
                        (current == 10 && (next == 50 || next == 100)) ||
                        (current == 100 && (next == 500 || next == 1000))
                ) {
                    result -= current;
                    continue;
                }
            }
            result += current;
        }
        return result;
    }
}
