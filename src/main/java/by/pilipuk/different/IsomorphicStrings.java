package by.pilipuk.different;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String a, String b) {
        Map<Character, Character> diff = new HashMap<>();
        Map<Character, Character> secDiff = new HashMap<>();

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            if (diff.get(charA) == null && secDiff.get(charB) == null) {
                diff.put(charA, charB);
                secDiff.put(charB, charA);
            }
            else if (!Objects.equals(diff.get(charA), charB) || !Objects.equals(secDiff.get(charB), charA)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a1 = "egg";
        String b1 = "add";

        String a2 = "foo";
        String b2 = "var";

        String a3 = "paper";
        String b3 = "title";

        String a4 = "abc";
        String b4 = "eee";

        String a5 = "aaa";
        String b5 = "bbb";

        String a6 = "ab";
        String b6 = "aa";

        System.out.println(isIsomorphic(a1, b1));
        System.out.println();
        System.out.println(isIsomorphic(a2, b2));
        System.out.println();
        System.out.println(isIsomorphic(a3, b3));
        System.out.println();
        System.out.println(isIsomorphic(a4, b4));
        System.out.println();
        System.out.println(isIsomorphic(a5, b5));
        System.out.println();
        System.out.println(isIsomorphic(a6, b6));
    }
}