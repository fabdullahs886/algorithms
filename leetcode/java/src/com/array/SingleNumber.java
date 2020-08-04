package com.array;

// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
// Note:
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Arrays.sort(nums);
        int tmp = 0;
        List list = new ArrayList<Integer>();
        for ( int i = 1; i < nums.length  ; i++){
            tmp = nums[i];
            if ( nums[i - 1] == nums[i] && !list.contains(nums[i])){
                list.add(nums[i]);
                tmp = 0;
            }


        }
        return tmp;
    }

    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(new int[]{2,2,1})); // ans : 1
        System.out.println(sol.singleNumber(new int[]{4,1,2,1,2})); // ans : 4
    }

}
