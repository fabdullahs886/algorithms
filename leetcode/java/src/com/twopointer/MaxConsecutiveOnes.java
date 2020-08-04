package com.twopointer;

//Given a binary array, find the maximum number of consecutive 1s in this array.
//
//        Example 1:
//        Input: [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s.
//        The maximum number of consecutive 1s is 3.
//        Note:
//
//        The input array will only contain 0 and 1.
//        The length of input array is a positive integer and will not exceed 10,000

public class MaxConsecutiveOnes {
    private int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 0;
        int newCount = 0;
        for(int i = 0; i < nums.length;i++){
            if ( nums[i] == 1) {
                count++;
                if (count >= newCount)
                    newCount = count;
            }else {
                count = 0;
            }
        }
        return newCount;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();
        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})); // ans: 2
        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})); // ans: 3
    }

}
