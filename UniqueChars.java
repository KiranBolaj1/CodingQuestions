package ArrayAndStrings;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("bcdfgh"));
    }

    // O(n) time complexity | O(1) space complexity, n = length of string
    public static boolean hasUniqueChars(String str) {
        if(str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
