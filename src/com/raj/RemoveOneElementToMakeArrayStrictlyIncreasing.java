/*
Remove One Element to Make the Array Strictly Increasing
Link: https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/

Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

Example 1:
Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
[1,2,5,7] is strictly increasing, so return true.

Example 2:
Input: nums = [2,3,1,2]
Output: false
Explanation:
[3,1,2] is the result of removing the element at index 0.
[2,1,2] is the result of removing the element at index 1.
[2,3,2] is the result of removing the element at index 2.
[2,3,1] is the result of removing the element at index 3.
No resulting array is strictly increasing, so return false.

Example 3:
Input: nums = [1,1,1]
Output: false
Explanation: The result of removing any element is [1,1].
[1,1] is not strictly increasing, so return false.

Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000
 */
package com.raj;

public class RemoveOneElementToMakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        // Initialization.
        int[] nums = new int[]{13, 205, 553, 527, 790, 238};
        int length = nums.length;
        boolean ans = true;
        int index = 0;
        int next = 1;
        int counter = 0;
        int indexToSkip = Integer.MAX_VALUE;

        if (length > 2) {
            // Iterate over the while loop.
            while (next < length) {
                if (nums[index] >= nums[next] && indexToSkip != index) {
                    counter++;
                    if (counter > 1) {
                        ans = false;
                        break;
                    }
                    if (next == length - 1) {
                        break;
                    }
                    if (nums[index] >= nums[next + 1]) {
                        indexToSkip = index;
                        if (index == 0) {
                            index++;
                            next++;
                        } else {
                            index--;
                        }
                    } else {
                        indexToSkip = next;
                        next++;
                    }
                } else {
                    index++;
                    if (index != indexToSkip) {
                        next++;
                    }
                }
            }
        }

        // Display the result.
        System.out.println("Ans: " + ans);
    }
}
