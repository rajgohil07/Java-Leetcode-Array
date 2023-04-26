/*
Add Digits
Link: https://leetcode.com/problems/add-digits/

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1

Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */
package com.raj;

public class AddDigits {
    public static void main(String[] args) {
        // Initialization.
        int num = 111;
        int sum = 0;

        // Logic.
        sum = provideTotalToOneDigit(num);

        // Display the result.
        System.out.println("The sum of the provided digit to the one digit is: " + sum);
    }

    private static int provideTotalToOneDigit(int num) {
        int ans = 0;
        if (num < 10) {
            return num;
        }
        while (num > 0) {
            ans += num % 10;
            num /= 10;
        }
        return provideTotalToOneDigit(ans);
    }
}
