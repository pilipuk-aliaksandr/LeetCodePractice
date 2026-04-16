package by.pilipuk;

public class FindIndex {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        FindIndex findIndex = new FindIndex();
        System.out.println(findIndex.strStr(haystack, needle));
    }
}
