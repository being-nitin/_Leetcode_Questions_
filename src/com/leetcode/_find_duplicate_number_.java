package com.leetcode;
import java.util.*;
public class _find_duplicate_number_ {
    public static void main(String[] args) {
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3


Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear onl

 */
        int[] nums = {3,1,1,4,2};
        System.out.println(duplicate(nums));
        System.out.println(4*2);
    }
    public static int duplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return nums.length;
    }
}
