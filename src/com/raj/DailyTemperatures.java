/*
Daily Temperatures
Link: https://leetcode.com/problems/daily-temperatures/

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]

Constraints:
1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
 */
package com.raj;

import java.util.Arrays;

public class DailyTemperatures {
    public static void main(String[] args) {
        // Initialization.
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = new int[temperatures.length];

        // Logic.
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (i != 0 && temperatures[i] == temperatures[i - 1]) {
                    ans[i] = Math.max(ans[i - 1] - 1, 0);
                    break;
                }
                if (temperatures[i] < temperatures[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }

        // Display the result.
        System.out.println(Arrays.toString(ans));
    }
}
