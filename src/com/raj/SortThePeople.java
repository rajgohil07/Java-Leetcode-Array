/*
Sort the People
Link: https://leetcode.com/problems/sort-the-people/

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

Example 2:
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.

Constraints:
n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */
package com.raj;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        // Initialization.
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        int length = heights.length;
        String[] ans = new String[length];
        int[] cloneHeights = heights.clone();

        // Logic.
        // Sort the array to descending order.
        quitOuterLoop:
        for (int i : heights) {
            int last = length - 1;
            int index = last - 1;
            boolean hasChangesMade = false;
            while (index >= 0) {
                if (heights[index] < heights[last]) {
                    int t = heights[index];
                    heights[index] = heights[last];
                    heights[last] = t;
                    hasChangesMade = true;
                }
                index--;
                last--;
            }
            // Quit the loop because the array is already sorted!
            if (!hasChangesMade) {
                break quitOuterLoop;
            }
        }

        // Assign the names value to the ans.
        for (int i = 0; i < length; i++) {
            int v = heights[i];
            for (int j = 0; j < length; j++) {
                if (v == cloneHeights[j]) {
                    ans[i] = names[j];
                    break;
                }
            }
        }

        // Display the result.
        System.out.println("Sorted person names: " + Arrays.toString(ans));
    }
}
