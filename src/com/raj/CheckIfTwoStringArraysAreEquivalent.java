package com.raj;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        // Initialization.
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        String wordStr1 = "";
        String wordStr2 = "";

        // Logic.
        for (String w : word1) {
            wordStr1 += w;
        }
        for (String w : word2) {
            wordStr2 += w;
        }

        // Display the result.
        System.out.println("Is string same: " + wordStr1.equals(wordStr2));
    }
}
