/*
DI String Match
Link: https://leetcode.com/problems/di-string-match/

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Example 1:
Input: s = "IDID"
Output: [0,4,1,3,2]

Example 2:
Input: s = "III"
Output: [0,1,2,3]

Example 3:
Input: s = "DDI"
Output: [3,2,0,1]

Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
 */
package com.raj;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        // Initialization.
        String s = "IDID";
        int N = s.length();
        int lo = 0;
        int hi = N;
        int[] ans = new int[N + 1];

        // Logic.

        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;

        // Display the result.
        System.out.println("Required DI string is: " + Arrays.toString(ans));
    }
}
