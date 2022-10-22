public class Upper_Case_First_Char {
    public static String toUpperCaseFirstCharOfWord(String stat) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(stat.charAt(0)));
        for (int i = 1; i < stat.length(); i++) {
            char ch = stat.charAt(i);
            if (ch == ' ' && i < stat.length() - 1) {
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(stat.charAt(i)));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am omkar ";
        System.out.println(toUpperCaseFirstCharOfWord(str));
    }
}
