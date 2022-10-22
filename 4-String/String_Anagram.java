import java.util.Arrays;

public class String_Anagram {
    public static boolean isAnagram(String arg1, String arg2) {
        String str1, str2;
        str1 = arg1.toLowerCase();
        str2 = arg2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1, string2)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("race", "care"));
    }
}
