/*
Make Array Strictly Increasing
Link: https://leetcode.com/problems/make-array-strictly-increasing/

Given two integer arrays arr1 and arr2, return the minimum number of operations (possibly zero) needed to make arr1 strictly increasing.

In one operation, you can choose two indices 0 <= i < arr1.length and 0 <= j < arr2.length and do the assignment arr1[i] = arr2[j].

If there is no way to make arr1 strictly increasing, return -1.

Example 1:
Input: arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
Output: 1
Explanation: Replace 5 with 2, then arr1 = [1, 2, 3, 6, 7].

Example 2:
Input: arr1 = [1,5,3,6,7], arr2 = [4,3,1]
Output: 2
Explanation: Replace 5 with 3 and then replace 3 with 4. arr1 = [1, 3, 4, 6, 7].

Example 3:
Input: arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
Output: -1
Explanation: You can't make arr1 strictly increasing.

Constraints:
1 <= arr1.length, arr2.length <= 2000
0 <= arr1[i], arr2[i] <= 10^9
 */
package com.raj;

public class MakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        // Initialization.
        int[] arr1 = {1, 5, 3, 6, 7};
        int[] arr2 = {1, 3, 2, 4};
        int ans = 1;

        // Logic.
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] >= arr1[i + 1]) {
                boolean valueFound = false;
                if (i == 0) {
                    for (int j : arr2) {
                        if (arr1[i + 1] > j) {
                            valueFound = true;
                            break;
                        }
                    }
                } else {
                    for (int j : arr2) {
                        if (arr1[i - 1] < j && arr1[i + 1] > j) {
                            valueFound = true;
                            break;
                        }
                    }
                }

                if (!valueFound) {
                    ans = -1;
                }
            }
        }

        if (ans == 1 && arr1[arr1.length - 2] >= arr1[arr1.length - 1]) {
            boolean valueFound = false;
            for (int j : arr2) {
                if (arr1[arr1.length - 2] < j) {
                    valueFound = true;
                    break;
                }
            }
            if (!valueFound) {
                ans = -1;
            }
        }

        // Display the result.
        if (ans == 1) {
            System.out.println("Yes, array can be made strictly increasing using the values from another array.");
        } else {
            System.out.println("No, array can not be made strictly increasing using the values from another array.");
        }
    }
}
