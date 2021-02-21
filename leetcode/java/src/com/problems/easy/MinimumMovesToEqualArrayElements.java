package com.problems.easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
    private int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = nums.length - 1; i >= 0; i-- ){
            count += nums[i] - nums[0];
        }
        return count;
    }

    public static void main(String[] args){
        MinimumMovesToEqualArrayElements obj = new MinimumMovesToEqualArrayElements();
        System.out.println(obj.minMoves(new int[]{1,2,3})); // 3
        System.out.println(obj.minMoves(new int[]{1,1,1})); // 0
        System.out.println(obj.minMoves(new int[]{1,2147483647})); // 2147483646
    }
}
