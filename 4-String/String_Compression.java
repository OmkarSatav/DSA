public class String_Compression {
    public static void main(String[] args) {
        String str = "";
        String str1 = "aaabbcccdeff";
        for (int i = 0; i < str1.length(); i++) {
            int count = 1;
            while ((i + 1) < str1.length() && str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
                i++;
            }
            str += str1.charAt(i);
            if (count > 1) {
                str += ((Integer) count).toString();
            }
        }
        System.out.println(str);
    }
}
