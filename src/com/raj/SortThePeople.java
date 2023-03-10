package com.raj;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        // Initialization.
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        int length = heights.length;
        String[] ans = new String[length];
        int[] cloneHeights = heights.clone();

        // Logic.
        // Sort the array to descending order.
        quitOuterLoop:
        for (int i : heights) {
            int last = length - 1;
            int index = last - 1;
            boolean hasChangesMade = false;
            while (index >= 0) {
                if (heights[index] < heights[last]) {
                    int t = heights[index];
                    heights[index] = heights[last];
                    heights[last] = t;
                    hasChangesMade = true;
                }
                index--;
                last--;
            }
            // Quit the loop because the array is already sorted!
            if (!hasChangesMade) {
                break quitOuterLoop;
            }
        }

        // Assign the names value to the ans.
        for (int i = 0; i < length; i++) {
            int v = heights[i];
            for (int j = 0; j < length; j++) {
                if (v == cloneHeights[j]) {
                    ans[i] = names[j];
                    break;
                }
            }
        }

        // Display the result.
        System.out.println("Sorted person names: " + Arrays.toString(ans));
    }
}
