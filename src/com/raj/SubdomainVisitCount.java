/*
Subdomain Visit Count
Link: https://leetcode.com/problems/subdomain-visit-count/

A website domain "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com" and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

A count-paired domain is a domain that has one of the two formats "rep d1.d2.d3" or "rep d1.d2" where rep is the number of visits to the domain and d1.d2.d3 is the domain itself.

For example, "9001 discuss.leetcode.com" is a count-paired domain that indicates that discuss.leetcode.com was visited 9001 times.
Given an array of count-paired domains cpdomains, return an array of the count-paired domains of each subdomain in the input. You may return the answer in any order.

Example 1:
Input: cpdomains = ["9001 discuss.leetcode.com"]
Output: ["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
Explanation: We only have one website domain: "discuss.leetcode.com".
As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.

Example 2:
Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation: We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.

Constraints:
1 <= cpdomain.length <= 100
1 <= cpdomain[i].length <= 100
cpdomain[i] follows either the "repi d1i.d2i.d3i" format or the "repi d1i.d2i" format.
repi is an integer in the range [1, 104].
d1i, d2i, and d3i consist of lowercase English letters.
 */
package com.raj;

import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        // Initialization.
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> ans = new ArrayList<>();

        // Logic.
        for (int i = 0; i < cpdomains.length; i++) {
            String domain = cpdomains[i];
            String[] splitter = domain.split(" ");
            int value = Integer.valueOf(splitter[0]);
            String onlyDomain = splitter[1];
            /*
            The split("\\.") method splits the string at each occurrence of "."
            and returns an array of substrings. Since the . character has a special meaning
            in regular expressions, we need to escape it using the double backslash \\ in the split() method.
             */
            String[] subDomainList = onlyDomain.split("\\.");
            StringBuilder tmp = new StringBuilder();
            // Split with subdomain. i.e. google.mail.com
            for (int j = subDomainList.length - 1; j >= 0; j--) {
                boolean isFound = false;
                if (tmp.isEmpty()) {
                    tmp.append(subDomainList[j]);
                } else {
                    // Empty the StringBuilder by setting its length to 0
                    String newVal = subDomainList[j] + "." + tmp;
                    tmp.setLength(0);
                    tmp.append(newVal);
                }
                // Search if existing domain exist, Then increase the value else add the value.
                for (int k = 0; k < ans.size(); k++) {
                    String domainvalue = ans.get(k);
                    if (domainvalue.endsWith(" " + tmp)) {
                        isFound = true;
                        String[] newDomainSplit = domainvalue.split(" ");
                        int newValue = Integer.valueOf(newDomainSplit[0]) + value;
                        String newString = newValue + " " + newDomainSplit[1];
                        ans.set(k, newString);
                        break;
                    }
                }
                if (!isFound) {
                    ans.add(value + " " + tmp);
                }
            }
        }

        // Display the result.
        System.out.println("The final sub domain visit counts are: " + ans);
    }
}
