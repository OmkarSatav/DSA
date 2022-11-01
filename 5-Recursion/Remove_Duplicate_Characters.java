public class Remove_Duplicate_Characters {
    public static void removeDuplicateCharacters(String str, int idx, StringBuilder newStr, Boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeDuplicateCharacters(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            newStr.append(ch);
            removeDuplicateCharacters(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        removeDuplicateCharacters("oommkaarao", 0, new StringBuilder(""), new Boolean[26]);
    }
}
