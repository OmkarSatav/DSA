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

    public static void main(String[] args) {
        String str = "mom";
        System.out.println("Is the String Palindrome : " + isPalindrome(str));
    }
}
