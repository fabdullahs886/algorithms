package com.problems.easy;

// Category : Easy
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//        Example:
//
//        Input: [-2,1,-3,4,-1,2,1,-5,4],
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//        Follow up:
//
//        If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle

public class MaximumSubarray {

    private int maxSubArray(int[] nums) {
        if (nums == null) return 0;
        int sum = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length;i++){
            if(sum < 0)
                sum = 0;
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray obj = new MaximumSubarray();
        System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // ans: 6 because [4,-1,2,1] has the largest sum = 6.
    }
}
