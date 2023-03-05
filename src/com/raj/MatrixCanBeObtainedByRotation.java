
/*
Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
Determine Whether Matrix Can Be Obtained By Rotation

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Example 1:
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.

Example 3:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
 */
package com.raj;

import java.util.Arrays;

public class MatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        int mat_l = mat.length;
        boolean is_same = false;
        int[][] ans = new int[mat_l][mat_l];
        int loop_limit = 3;

        int mat_val = 0;
        int target_val = 0;

        for (int i = 0; i < mat_l; i++) {
            for (int j = 0; j < mat_l; j++) {
                mat_val += mat[i][j];
                target_val += target[i][j];
            }
        }

        if (mat_val == target_val) {
            for (int i = 0; i <= loop_limit; i++) {
                for (int j = 0; j < mat_l; j++) {
                    for (int k = 0; k < mat_l; k++) {
                        ans[k][mat_l - 1 - j] = mat[j][k];
                    }
                }
                System.out.println("\n" + (i + 1) + " rotation.");
                for (int[] x : ans) {
                    System.out.println(Arrays.toString(x));
                }
                if (Arrays.deepEquals(ans, target)) {
                    is_same = true;
                    break;
                } else {
                    for (int k = 0; k < mat_l; k++) {
                        mat[k] = Arrays.copyOf(ans[k], mat_l);
                    }
                }
            }
        }

        if (is_same) {
            System.out.println("\nYes, We can get the target matrix by the rotation.");
        } else {
            System.out.println("\nNo, Rotating the array will not get the target matrix");
        }
    }
}
