/*
Find First Palindromic String in the Array
Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

Example 1:
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

Example 2:
Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

Example 3:
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.
 */
package com.raj;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        // Initialization.
        String[] words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        StringBuilder ans = new StringBuilder();

        // Logic.
        for (String str : words) {
            int l = str.length();
            if (l == 1) {
                ans.append(str);
                break;
            } else {
                int s = 0;
                int e = l - 1;
                boolean isPalidrom = true;
                while (s < e) {
                    if (str.charAt(s) != str.charAt(e)) {
                        isPalidrom = false;
                        break;
                    }
                    s++;
                    e--;
                }
                if (isPalidrom) {
                    ans.append(str);
                    break;
                }
            }
        }

        // Display the result.
        System.out.println("First Palindromic String in the Array: " + ans.toString());
    }
}
