/*
Jewels and Stones
Link: https://leetcode.com/problems/jewels-and-stones/

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
 */
package com.raj;

public class JewelsAndStones {
    public static void main(String[] args) {
        // Initialization.
        String jewels = "aA", stones = "aAAbbbb";
        int ans = 0;

        // Logic.
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1) {
                ans++;
            }
        }

        // Display the result.
        System.out.println("Ans: " + ans);
    }
}
