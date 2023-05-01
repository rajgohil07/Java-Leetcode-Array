/*
Average Salary Excluding the Minimum and Maximum Salary
Link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

Example 2:
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

Constraints:
3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.
 */
package com.raj;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        // Initialization.
        int[] salary = {4000, 3000, 1000, 2000};
        int min = 1_000_000;
        int max = 1000;
        double ans = 0;

        // Logic.
        for (int i : salary) {
            ans += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        // Set the average of salary with length - 2 (excluding the minimum and maximum salary).
        double result = (ans - min - max) / (salary.length - 2);

        // Display the result.
        System.out.println(result + " is the average salary excluding the minimum and maximum salary.");
    }
}
