package com.raj;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        // Initialization.
        String[] words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        StringBuilder ans = new StringBuilder();

        // Logic.
        for (String str : words) {
            int l = str.length();
            if (l == 1) {
                ans.append(str);
                break;
            } else {
                int s = 0;
                int e = l - 1;
                boolean isPalidrom = true;
                while (s < e) {
                    if (str.charAt(s) != str.charAt(e)) {
                        isPalidrom = false;
                        break;
                    }
                    s++;
                    e--;
                }
                if (isPalidrom) {
                    ans.append(str);
                    break;
                }
            }
        }

        // Display the result.
        System.out.println("First Palindromic String in the Array: " + ans.toString());
    }
}
