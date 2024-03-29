/*
Keyboard Row
Link: https://leetcode.com/problems/keyboard-row/

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).
 */
package com.raj;

import java.util.ArrayList;

public class KeyboardRow {
    public static void main(String[] args) {
        // Initialization.
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
