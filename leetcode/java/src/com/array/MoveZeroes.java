package com.array;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Example:
//
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Note:
//
//        1. You must do this in-place without making a copy of the array.
//        2. Minimize the total number of operations.

import com.strings.ReverseWordsInString3;

public class MoveZeroes {
    private void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length;i++){
            if ( nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[a];
                nums[a] = tmp;
                a++;
            }
        }
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();
        sol.moveZeroes(new int[]{0,1,0,3,12}); // ans: [1,3,12,0,0]
    }

}
