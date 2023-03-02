/*
Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

Check if the Sentence Is Pangram.
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false
 */
package com.raj;

import java.util.ArrayList;
import java.util.Arrays;

public class IsPangram {
    public static void main(String[] args) {
        ArrayList<Character> a = new ArrayList<Character>();
        a.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        String str = "thequickbrownfoxjumpsoverthelazydog";

        for (int i = 0; i < str.length(); i++) {
            int t = a.indexOf(str.charAt(i));
            if (t > -1) {
                a.remove(t);
            }
        }

        if (a.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
