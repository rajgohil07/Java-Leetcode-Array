/*
Link: https://leetcode.com/problems/count-items-matching-a-rule/

Count Items Matching a Rule

You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

Example 2:
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */
package com.raj;

import java.util.List;

import static java.util.Arrays.*;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

        // Ref: https://stackoverflow.com/questions/6232986/how-do-i-initialize-a-two-dimensional-list-statically
        List<List<String>> list = asList(
                asList("phone", "blue", "pixel"),
                asList("computer", "silver", "lenovo"),
                asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";
        int ans = 0;

        int checkIndex = 0;
        if (ruleKey == "color") {
            checkIndex = 1;
        } else if (ruleKey == "name") {
            checkIndex = 2;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(checkIndex) == ruleValue) {
                ans += 1;
            }
        }

        System.out.println("ans = " + ans);
    }
}
