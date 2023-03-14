package com.raj;

import java.util.ArrayList;

public class KeyboardRow {
    public static void main(String[] args) {
        // Initialization
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        ArrayList<String> ans = new ArrayList<>();

        // Logic.
        for (String s : words) {
            String stringToCheck = stringToCheck(s.charAt(0));
            boolean isValid = true;
            for (char c : s.toCharArray()) {
                if (!stringToCheck.contains(String.valueOf(c))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                ans.add(s);
            }
        }

        // Display the result.
        System.out.println("Keyboard rows: " + ans);
    }

    // Function to select the string for keyboard row.
    private static String stringToCheck(char c) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        String strToReturn;
        if (one.contains(String.valueOf(c))) {
            strToReturn = one;
        } else if (two.contains(String.valueOf(c))) {
            strToReturn = two;
        } else {
            strToReturn = three;
        }
        return strToReturn;
    }
}
