/*
Add to Array-Form of Integer

Link: https://leetcode.com/problems/add-to-array-form-of-integer/

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

Constraints:
1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104
 */
package com.raj;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        // Initialize the values.
        int[] num = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        int length = num.length;
        long val = 0;

        // Combined the array to the number.
        for (int i = 0; i < length; i++) {
            long currentVal = num[i];
            for (int j = 0; j < length - 1 - i; j++) {
                currentVal *= 10;
            }
            val += currentVal;
        }

        val += k;
        List<Integer> list = new ArrayList<>();

        // Set the data to the list.
        while (val > 0) {
            int mod = (int) (val % 10);
            list.add(mod);
            val /= 10;
        }

        // Reverse the list.
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int t = list.get(start);
            list.set(start, list.get(end));
            list.set(end, t);
            start++;
            end--;
        }

        // Print the result.
        System.out.println("list = " + list);
    }
}
