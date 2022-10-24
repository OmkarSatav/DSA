public class Unique_Characters_In_String {
    public static void func(String str, int idx, StringBuilder newStr, Boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            func(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            newStr.append(ch);
            func(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        func("oommkaarao", 0, new StringBuilder(""), new Boolean[26]);
    }
}
