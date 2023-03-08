/*
Left and Right Sum Differences
Link: https://leetcode.com/problems/left-and-right-sum-differences/

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

Example 1:
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

Example 2:
Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].

Constraints:
1 <= nums.length <= 1000
1 <= nums[i] <= 105
 */
package com.raj;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        // Initialization.
        int[] nums = new int[]{10, 4, 8, 3};
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] ans = new int[length];
        int leftSum = 0;
        int rightSum = 0;

        // Set the values into the left and right array of total.
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                left[i] = leftSum;
                right[length - i - 1] = rightSum;
            }
            leftSum += nums[i];
            rightSum += nums[length - i - 1];
        }

        // Take a positive difference of two arrays left and right.
        for (int i = 0; i < length; i++) {
            int r = right[i];
            int l = left[i];
            if (r > l) {
                ans[i] = r - l;
            } else {
                ans[i] = l - r;
            }
        }

        // Display the result.
        System.out.println("Left array sum: " + Arrays.toString(left));
        System.out.println("Right array sum: " + Arrays.toString(right));
        System.out.println("Ans array after difference: " + Arrays.toString(ans));
    }
}
