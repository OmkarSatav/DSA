public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        int mid = (n - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    // Accepts all strings
    // "A man, a plan, a canal: Panama" - Example
    public static boolean isPalin(String s) {
        String str = s.toLowerCase();
        StringBuilder strNew = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                strNew.append(c);
            }
        }

        int n = strNew.length();
        for (int i = 0; i < n / 2; i++) {
            if (strNew.charAt(i) != strNew.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "raccar";
        System.out.println("Is the String Palindrome : " + isPalindrome(str));

        str = "A man, a plan, a canal: Panama";

        System.out.println("Is the String '" + str + "' Palindrome : " + isPalin(str));
    }
}
