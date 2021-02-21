package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    private int findMissingNumber(int[] nums){
        return solution3(nums);
    }

    private int solution1(int[] nums){
        // works with duplicate
        boolean[] list = new boolean[nums.length + 1];
        for(int n: nums){
            list[n] =  true;
        }
        for(int i = list.length - 1; i > 0; i--){
            if(list[i] == false)
                return i;
        }
        return -1;
    }

    private int solution2(int[] nums){
        // doesn't work with duplicate
        int num = nums.length + 1;
        int sum = num*(num + 1)/2;
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return ( sum - total);
    }

    private int solution3(int[] nums){
        // doesn't work with duplicate
        int num = nums.length + 1;
//        for(int)
        return 0;
    }

    public static void main(String[] args){
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.findMissingNumber(new int[]{1,2,3,5})); // 4
        System.out.println(obj.findMissingNumber(new int[]{1,5,3,2,7,6,4,8,9})); // 10
        System.out.println(obj.findMissingNumber(new int[]{1,2,4})); // 3
        System.out.println(obj.findMissingNumber(new int[]{1})); // 2
        System.out.println(obj.findMissingNumber(new int[]{2})); // 1
    }
}
