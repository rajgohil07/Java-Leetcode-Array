/*
Find Words That Can Be Formed by Characters.
Link: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

Constraints:
1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.
 */
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
                    t.deleteCharAt(i);
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
