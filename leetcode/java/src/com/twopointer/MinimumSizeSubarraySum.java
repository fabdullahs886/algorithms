package com.twopointer;

//Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//        Example:
//
//        Input: s = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: the subarray [4,3] has the minimal length under the problem constraint.
//        Follow up:
//        If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).


public class MinimumSizeSubarraySum {
    private int minSubArrayLen(int s, int[] nums) {
        if ( nums.length == 0)
            return 0;
//  solution 1
//        int n = nums.length;
//        int ans = Integer.MAX_VALUE;
//        int left = 0;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            while (sum >= s) {
//                ans = Math.min(ans, i + 1 - left);
//                sum -= nums[left++];
//            }
//        }
//        return (ans != Integer.MAX_VALUE) ? ans : 0;

// Solution 2
        int prevResult = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;i++){
            int sum = 0, result = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if (sum >= s ){
                    result = j - i;
                    if ( prevResult >= result) {
                        prevResult = result;
                        break;
                    }
                }
            }
        }
        return prevResult == Integer.MAX_VALUE ? 0 : ++prevResult;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum sol = new MinimumSizeSubarraySum();
        System.out.println(sol.minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // ans: [4,3]
        System.out.println(sol.minSubArrayLen(3, new int[]{1,1})); // ans: [4,3]
    }

}
