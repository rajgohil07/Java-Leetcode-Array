/*
Fizz Buzz
Link: https://leetcode.com/problems/fizz-buzz/

Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Example 1:
Input: n = 3
Output: ["1","2","Fizz"]

Example 2:
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

Example 3:
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

Constraints:
1 <= n <= 104
 */
package com.raj;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> ans = new ArrayList<>(3);
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                ans.add(i - 1, "FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add(i - 1, "Fizz");
            } else if (i % 5 == 0) {
                ans.add(i - 1, "Buzz");
            } else {
                ans.add(i - 1, String.valueOf(i));
            }
        }
        System.out.println("ans = " + ans);
    }
}
