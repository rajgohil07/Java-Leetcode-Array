package com.raj;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        // Initialization.
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        StringBuilder wordStr1 = new StringBuilder();
        StringBuilder wordStr2 = new StringBuilder();

        // Logic.
        for (String w : word1) {
            wordStr1.append(w);
        }
        for (String w : word2) {
            wordStr2.append(w);
        }

        // Display the result.
        System.out.println("Is string same: " + wordStr1.toString().equals(wordStr2.toString()));
    }
}
