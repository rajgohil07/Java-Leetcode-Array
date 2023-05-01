/*
Remove All Occurrences of a Substring
Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */
package com.raj;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        // Initialization.
        String s = "kirkirkirpgpgpkirpgkirkirpgkirpgkikikirpgrpgrkirpkirpgkirpggpgpkikirpgrkirkirpgpgpggkikirpgrpggkirpgbkirpgthytpyimz";
        String part = "kirpg";
        StringBuilder ans = new StringBuilder(s);

        // Logic.
        recursiveStringReplace(ans, part);

        // Display the result.
        System.out.println("The final string after removing all the occurrences of a substring: " + ans + ".");
    }

    // Recursive call the function itself to replace the string with the part.
    private static void recursiveStringReplace(StringBuilder s, String part) {
        int subStringStartIndex = s.indexOf(part);
        if (subStringStartIndex != -1) {
            s.delete(subStringStartIndex, subStringStartIndex + part.length());
            recursiveStringReplace(s, part);
        }
    }
}
