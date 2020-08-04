package com.array;

//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.Arrays;

public class ContainsDuplicate {
    private boolean containsDuplicate(int[] nums) {
        Arrays. sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if ( nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(sol.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}
