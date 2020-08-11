package com.problems.easy;

// Category : Easy
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private int[] twoSum(int[] nums, int target) {
        int[] result = null;

        result = bruteForce(nums, target);
        System.out.println("Brute force result : " + Arrays.toString(result));

        result = twoPassHashtable(nums, target);
        System.out.println("TwoPassHashtable result : " + Arrays.toString(result));

        result = onePassHashmap(nums, target);
        System.out.println("OnePassHashmap result : " + Arrays.toString(result));

        return result;
    }

    private int[] onePassHashmap(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }

    private int[] twoPassHashtable(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if ( map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }
        return null;
    }

    private int[] bruteForce(int[] nums, int target){
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            boolean flag = false;
            for(int j = i + 1; j < nums.length;j++ ){
                if(nums[i] + nums[j]  == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        obj.twoSum(new int[]{2, 7, 11, 15}, 9); // ans: [0, 1]
    }
}
