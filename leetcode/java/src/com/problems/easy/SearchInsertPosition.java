package com.problems.easy;

// Category : Easy
//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You may assume no duplicates in the array.
//
//        Example 1:
//
//        Input: [1,3,5,6], 5
//        Output: 2
//        Example 2:
//
//        Input: [1,3,5,6], 2
//        Output: 1
//        Example 3:
//
//        Input: [1,3,5,6], 7
//        Output: 4
//        Example 4:
//
//        Input: [1,3,5,6], 0
//        Output: 0

import com.twopointer.RemoveElement;

import java.awt.desktop.PreferencesEvent;

public class SearchInsertPosition {

    private int searchInsert(int[] nums, int target) {
        int result =  solution1(nums,target);
        result = solution2(nums,target);
        return result;
    }
    private int solution2(int[] nums, int target){
        if(nums == null || nums.length == 0) return 0;
        if (nums[0] > target) return 0;
        if(nums[nums.length - 1] < target) return nums.length;

        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = (low + (high - low) / 2);
            if (nums[mid] == target) return mid;
            if(nums[mid] < target && target < nums[mid + 1]) return mid + 1;
            if(nums[mid] < target) low = mid + 1;
            else
                high = mid;
        }
        return nums.length - 1;
    }

    private int solution1(int[] nums, int target){
        if(nums == null) return 0;
        int result = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == target){
                return i;
            }else if(nums[i] > target){
                if(i == 0)
                    return i;
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},5)); // ans: 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},2)); // ans: 1
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},7)); // ans: 4
        System.out.println(sol.searchInsert(new int[]{1,3,5,6},0)); // ans: 0
        System.out.println(sol.searchInsert(new int[]{2,4,6,8,10},12)); // ans: 5
        System.out.println(sol.searchInsert(new int[]{2,4,6,8,10},0)); // ans: 0
        System.out.println(sol.searchInsert(new int[]{},1)); // ans: 0
        System.out.println(sol.searchInsert(null,1)); // ans: 0
    }
}
