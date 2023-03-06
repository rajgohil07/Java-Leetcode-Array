/*
Two Sum
Link: https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */
package com.raj;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int l = nums.length;
        int target = 9;
        int[] ans = new int[2];

        outer_loop:
        for (int i = 0; i < l - 1; i++) {
            int digit_required = target - nums[i];
            for (int j = 1; j < l; j++) {
                if (nums[j] == digit_required) {
                    ans[0] = i;
                    ans[1] = j;
                    break outer_loop;
                }
            }
        }

        System.out.println("Index values for the sum of " + target + " is:" + " " + Arrays.toString(ans));
    }
}
