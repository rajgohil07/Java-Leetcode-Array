/*
Shortest Distance to a Character
Link: https://leetcode.com/problems/shortest-distance-to-a-character/

Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

Example 1:
Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

Example 2:
Input: s = "aaab", c = "b"
Output: [3,2,1,0]

Constraints:
1 <= s.length <= 104
s[i] and c are lowercase English letters.
It is guaranteed that c occurs at least once in s.
 */
package com.raj;

import java.util.Arrays;

public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char f = 'e';
        int l = s.length();
        int[] ans = new int[l];

        // Logic.
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == f) {
                // Simply skip this iteration.
                continue;
            }
            int t1 = Integer.MAX_VALUE, t2 = Integer.MAX_VALUE;
            for (int j = i + 1; j < l; j++) {
                if (s.charAt(j) == f) {
                    t1 = j;
                    break;
                }
            }
            for (int k = i - 1; k >= 0; k--) {
                if (s.charAt(k) == f) {
                    t2 = k;
                    break;
                }
            }
            // Return minimum positive difference.
            ans[i] = Math.min(Math.abs(i - t1), Math.abs(i - t2));
        }

        // Display the result.
        System.out.println("Shortest Distance to a Character " + "'" + f + "'" + " for each character string is: " + Arrays.toString(ans));
    }
}
