/*
Sign of the Product of an Array
Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */
package com.raj;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        // Initialization.
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int counter = 0;
        int ans = 1;

        // Logic.
        for (int i : nums) {
            if (i == 0) {
                ans = 0;
                break;
            }
            if (i < 0) {
                counter++;
            }
        }
        if (ans != 0 && counter % 2 != 0) {
            ans = -1;
        }

        // Display the result.
        System.out.println("The sign of the product of any array is: " + ans);
    }
}
