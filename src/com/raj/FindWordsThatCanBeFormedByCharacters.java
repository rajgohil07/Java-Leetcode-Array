package com.raj;

public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        // Initialization.
        String[] words = new String[]{"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int ans = 0;

        // Logic.
        for (String s : words) {
            StringBuilder t = new StringBuilder(chars);
            boolean isValid = true;
            for (int i = 0; i < s.length(); i++) {
                if (chars.contains(String.valueOf(s.charAt(i)))) {
                    t.setCharAt(i, ' ');
                } else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                ans += s.length();
            }
        }

        // Display the result.
        System.out.println("Word counts which can be formed by characters: " + ans);
    }
}
