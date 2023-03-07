/*
Reshape the Matrix
Link: https://leetcode.com/problems/reshape-the-matrix/description/

In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]


Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
 */
package com.raj;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {

        // Initialization
        int[][] mat = new int[][]{
                {1},
                {2},
                {3},
                {4}
        };
        int r = 2;
        int c = 2;
        int mat_rl = mat.length;
        int mat_cl = mat[0].length;

        // Return the original matrix if invalid row and column values provided.
        if (r * c != (mat_cl * mat_rl)) {
            for (int[] i : mat) {
                System.out.println(Arrays.toString(i));
            }
        }

        // Return the original matrix if the matrix RxC and provided R and C are same.
        if ((mat_cl == c) && (mat_rl == r)) {
            for (int[] i : mat) {
                System.out.println(Arrays.toString(i));
            }
        }

        // Initialization
        int[] temp = new int[r * c];
        int[][] ans = new int[r][c];

        // Store the matrix data into the one dimension temp array.
        for (int i = 0; i < mat_rl; i++) {
            for (int j = 0; j < mat_cl; j++) {
                temp[(((mat_cl) * i) + j)] = mat[i][j];
            }
        }

        // if the required array's r value is 1 then simply return the 1 dimension temp array.
        if (r == 1) {
            System.out.println("Ans: ");
            System.out.println(Arrays.toString(temp));
        }
        // Store the temp array data into the required r and c format array.
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = temp[((i * c) + j)];
            }
        }

        // Output the result.
        System.out.println("Ans: ");
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
}
