/*
Check If Two String Arrays are Equivalent
Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
 */
package com.raj;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        // Initialization.
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        StringBuilder wordStr1 = new StringBuilder();
        StringBuilder wordStr2 = new StringBuilder();

        // Logic.
        for (String w : word1) {
            wordStr1.append(w);
        }
        for (String w : word2) {
            wordStr2.append(w);
        }

        // Display the result.
        System.out.println("Is string same: " + wordStr1.toString().equals(wordStr2.toString()));
    }
}
