/*
Plus One
Link: https://leetcode.com/problems/plus-one/

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */
package com.raj;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        // Initialization
        int[] digits = new int[]{9, 9, 9};
        boolean isContainNineDigitOnly = true;

        // Check whether the all values contain 9 digit or not.
        for (int i : digits) {
            if (i != 9) {
                isContainNineDigitOnly = false;
                break;
            }
        }

        // Add 1 value to the first element and make other elements as zero.
        if (isContainNineDigitOnly) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            System.out.println("ans = " + Arrays.toString(ans));
        }
        // if element value is 1o then assign that element 0 and add 1 value to previous element.
        else {
            // Add the 1 number from the last array element.
            for (int i = digits.length - 1; i >= 0; i--) {
                int val = digits[i];
                if (i == digits.length - 1) {
                    if (val + 1 == 10) {
                        digits[i] = 0;
                        digits[i - 1] = digits[i - 1] + 1;
                    } else {
                        digits[i] = val + 1;
                    }
                } else if (val == 10) {
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;

                }

            }
        }

        // Display the result.
        System.out.println(Arrays.toString(digits));
    }
}
