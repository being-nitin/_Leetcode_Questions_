package com.leetcode;
import java.util.*;

public class _sum_closest_ {
    public static int sumClosest(int[] arr, int target) {
        int closestSum = arr[0] + arr[1] + arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int currSum = arr[i] + arr[start] + arr[end];
                if (currSum > target) {
                    end--; // end counter will reduce by one
                } else {
                    start++;
                }
                /*will check in very step that the difference of currsum and closestsum is
                less than or not.
                 */
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {

    }
}