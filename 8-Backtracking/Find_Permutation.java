public class Find_Permutation {
    public static void permutations(String str, String ans) {
      
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remove selected character from string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutations(newStr, ans + ch);
        }
    }

    public static void main(String[] args) {
        permutations("abc", "");
    }
}
