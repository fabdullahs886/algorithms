package com.problems.easy;

import java.util.Arrays;

public class SetMismatch {
    private int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int missing = 0;
        int dup = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                dup  = nums[i];
                break;
            }
        }
        boolean[] flags = new boolean[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            flags[nums[i]] = true;
        }

        for(int i = 0; i < flags.length; i++){
            if(flags[i] == false)
                missing = i;
        }

        result[0] = dup;
        result[1] = missing;
        return result;
    }
    public static void main(String[] args){
        SetMismatch obj = new SetMismatch();
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{1,2,2,4}))); // [2,3]
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{1,1}))); // [1,2]
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{2,2}))); // [2,1]
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{2,2}))); // [2,1]
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{3,2,3,4,6,5}))); // [3,1]
        System.out.println(Arrays.toString(obj.findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9}))); // [2,10]
    }
}
