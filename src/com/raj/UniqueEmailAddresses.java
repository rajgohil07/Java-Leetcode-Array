/*
Unique Email Addresses
Link: https://leetcode.com/problems/unique-email-addresses/
 */
package com.raj;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Set<String> set = new HashSet<>();

        // Logic
        for (String e : emails) {
            // Split the string with @ to get the local and domain name.
            String[] t = e.split("@");
            String localName = t[0];
            String domainName = t[1];
            /*
             Remove left part of local name starting with "+"
             i.e. If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
             This allows certain emails to be filtered. Note that this rule does not apply to domain names.
             */
            String[] t1 = localName.split("\\+");
            localName = t1[0];
            /*
              Remove the dot from the local name because raj.gohil and rajgohil is same local name.
              Note that this rule does not apply to domain names.
             */
            localName = localName.replaceAll("\\.", "");
            set.add(localName + "@" + domainName);
        }

        // Display the unique email list with count.
        System.out.println("Unique set of emails: " + set);
        System.out.println("Unique email count: " + set.size());
    }
}
