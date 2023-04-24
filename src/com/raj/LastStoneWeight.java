/*
Last Stone Weight
Link: https://leetcode.com/problems/last-stone-weight/description/

You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

Example 2:
Input: stones = [1]
Output: 1

Constraints:
1 <= stones.length <= 30
1 <= stones[i] <= 1000
 */
package com.raj;

import java.util.ArrayList;
import java.util.Comparator;

public class LastStoneWeight {
    public static void main(String[] args) {
        // Initialization.
        int[] stones = {2, 7, 4, 1, 8, 1};
        ArrayList<Integer> ans = new ArrayList<>();

        // Storing the data to the array list.
        for (int i : stones) {
            ans.add(i);
        }

        // Logic.
        while (ans.size() >= 2) {
            // Sort the ArrayList in descending order.
            ans.sort(Comparator.reverseOrder());
            int firstVal = ans.get(0);
            int secondVal = ans.get(1);
            // Get the positive difference.
            int val = Math.abs(firstVal - secondVal);
            ans.remove(0);
            ans.set(0, val);
        }

        // Display the result.
        System.out.println("The last stone weight is: " + ans.get(0));
    }
}