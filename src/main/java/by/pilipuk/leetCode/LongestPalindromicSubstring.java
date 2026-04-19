package by.pilipuk.leetCode;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int currLength1 = 0;
            int currLength = 0;

            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
                currLength1++;
                l--;
                r++;
                if (maxLength <= currLength1) {
                    maxLength = currLength1;
                    result.setLength(0);
                    result.append(s.substring(i - currLength1, i + 1 + currLength1));

                }
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
                currLength++;
                l--;
                r++;
                if (maxLength < currLength) {
                    maxLength = currLength;
                    result.setLength(0);
                    result.append(s.substring(i + 1 - currLength, i + 1 + currLength));
                }

            }
        }
        if (result.isEmpty()) {
            return String.valueOf(s.charAt(0));
        } else {
            return result.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}

// a a b c b a a
// 0 1 2 3 4 5 6