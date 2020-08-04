package com.array;

//Given an array of integers nums, write a method that returns the "pivot" index of this array.
//
//We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
//
//If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

public class PivotIndex {

    private int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;

        for( int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
//        System.out.println("Sum = " + sum);

        for (int i = 0; i < nums.length; i++){
            if ( sum - leftSum - nums[i] == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex sol = new PivotIndex();
        System.out.println(sol.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})); // ans : 3
        System.out.println(sol.pivotIndex(new int[]{1, 2, 3})); // ans : -1
    }

}
