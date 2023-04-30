/*
Arranging Coins
Link: https://leetcode.com/problems/arranging-coins/

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 */
package com.raj;

public class ArrangingCoins {
    public static void main(String[] args) {
        // Initialization.
        int n = 5;
        int temp=n;
        int incrementer = 1;

        // Logic.
        while (n > 0) {
            n = n - incrementer;
            incrementer++;
        }
        if (n < 0) {
            incrementer -= 2;
        } else {
            incrementer -= 1;
        }

        // Display the result.
        System.out.println(incrementer + " perfect rows can be created with the " + temp + " coins.");
    }
}
