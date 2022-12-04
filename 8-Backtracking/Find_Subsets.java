public class Find_Subsets {
    public static void findSubsets(String ans, String str, int i) {
        if (str.length() == i) {
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // Yes
        findSubsets(ans + str.charAt(i), str, i + 1); // Consider character at current index.

        // No
        findSubsets(ans, str, i + 1); // Ignore character at currect index.
    }

    public static void main(String args[]) {
        String str = "abc";

        findSubsets("", str, 0);
    }
}
