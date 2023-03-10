/*
Count the Number of Consistent Strings
Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

Example 3:
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

Constraints:
1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
 */
package com.raj;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        // Initialization.
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        int ans = 0;

        // Logic.
        for (int i = 0; i < words.length; i++) {
            int charlength = words[i].toCharArray().length;
            for (int j = 0; j < charlength; j++) {
                if (allowed.contains(Character.toString(words[i].charAt(j)))) {
                    if ((j == charlength - 1)) {
                        ans++;
                    }
                } else {
                    break;
                }
            }
        }

        // Display the result.
        System.out.println("Count: " + ans);
    }
}
