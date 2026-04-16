package by.pilipuk;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String xStr = Integer.toString(x);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = xStr.length() - 1; i >= 0; i--) {
                stringBuilder.append(xStr.charAt(i));
            }
            String reverseStr = stringBuilder.toString();

            if (reverseStr.equals(xStr)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
