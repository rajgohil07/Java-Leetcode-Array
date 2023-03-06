/*
Lucky Numbers in a Matrix
Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
 */
package com.raj;

import java.util.Arrays;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {3, 6},
                {7, 1},
                {5, 2},
                {4, 8}
        };

        // Variable initialization.
        int m = matrix.length;
        int n = matrix[0].length;
        int finalMaxValue = Integer.MIN_VALUE;
        int finalMinValue = Integer.MAX_VALUE;
        int[] minArr = new int[m];
        int[] maxArr = new int[n];

        // Gather the array of the lowest values by parent array.
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int currentVal = matrix[i][j];
                int maxArrValue = maxArr[j];
                if (min > currentVal) {
                    min = currentVal;
                }
                if (maxArrValue < currentVal) {
                    maxArr[j] = currentVal;
                }
            }
            minArr[i] = min;
        }

        // Gather the max value.
        for (int i = 0; i < m; i++) {
            int v = minArr[i];
            if (v > finalMaxValue) {
                finalMaxValue = v;
            }
        }

        // Gather the min value.
        for (int i = 0; i < n; i++) {
            int v = minArr[i];
            if (finalMinValue > v) {
                finalMinValue = v;
            }
        }

        // Log the result.
        System.out.println("finalMinValue = " + finalMinValue);
        System.out.println("finalMaxValue = " + finalMaxValue);

        if (finalMinValue == finalMaxValue) {
            // Ref: https://stackoverflow.com/questions/16413032/java-how-to-return-int-array-from-list-of-inputs
            System.out.println("Lucky number: " + Arrays.asList(finalMaxValue));
        } else {
            // Ref: https://stackoverflow.com/questions/16413032/java-how-to-return-int-array-from-list-of-inputs
            System.out.println("Lucky number: " + Arrays.asList());
        }

    }
}
