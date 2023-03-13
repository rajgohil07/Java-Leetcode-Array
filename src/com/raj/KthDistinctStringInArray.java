/*
Kth Distinct String in an Array
Link: https://leetcode.com/problems/kth-distinct-string-in-an-array/

A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

Example 1:
Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned.

Example 2:
Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.

Example 3:
Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".

Constraints:
1 <= k <= arr.length <= 1000
1 <= arr[i].length <= 5
arr[i] consists of lowercase English letters.
 */
package com.raj;

import java.util.ArrayList;

public class KthDistinctStringInArray {
    public static void main(String[] args) {
        // Initialization.
        String[] arr = new String[]{"d", "b", "c", "b", "c", "a"};
        int k = 2;
        int length= arr.length;
        ArrayList<String> uniqueArr = new ArrayList<>();
        ArrayList<String> valueToSkip = new ArrayList<>();
        String ans = "";

        // Logic.
        for (int i = 0; i < length; i++) {
            String parentValue = arr[i];
            if (!valueToSkip.contains(parentValue) && i == length - 1) {
                uniqueArr.add(parentValue);
            }
            for (int j = (i + 1); j < length; j++) {
                String childValue = arr[j];
                if (valueToSkip.contains(childValue)) {
                    break;
                }
                if (parentValue.equals(childValue)) {
                    valueToSkip.add(parentValue);
                } else if (j + i == length) {
                    uniqueArr.add(parentValue);
                }
            }
        }

        // Display the result.
        System.out.println("Unique Array list: " + uniqueArr);
        if (uniqueArr.size() >= k - 1) {
            ans = uniqueArr.get(k - 1);
        }
        System.out.println("Distinct Unique String at a " + k + " position is: " + ans);
    }
}
