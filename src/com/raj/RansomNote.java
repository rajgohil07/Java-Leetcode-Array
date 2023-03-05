/*
Ransom Note
Link: https://leetcode.com/problems/ransom-note/
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/
package com.raj;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        char[] ransomNoteArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();

        if ( ransomNoteArr.length > magazineArr.length) {
            System.out.println("String not matched");
        }

        for (int i:ransomNoteArr) {
            boolean is_matched = false;
            for (int j = 0; j < magazineArr.length; j++) {
                if (i == magazineArr[j]) {
                    is_matched = true;
                    magazineArr[j] = 'A';
                    break;
                }
            }
            if (!is_matched) {
                System.out.println("String not matched");
            }
        }
        System.out.println("String matched!");
    }
}
