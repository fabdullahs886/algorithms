package com.array;

//Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
//
//        Example 1:
//        Input: [3, 2, 1]
//
//        Output: 1
//
//        Explanation: The third maximum is 1.
//        Example 2:
//        Input: [1, 2]
//
//        Output: 2
//
//        Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
//        Example 3:
//        Input: [2, 2, 3, 1]
//
//        Output: 1
//
//        Explanation: Note that the third maximum here means the third maximum distinct number.
//        Both numbers with value 2 are both considered as second maximum.

import com.twopointer.SortArrayByParity;

import java.util.Arrays;

public class ThirdMaximumNumber {
    private int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for(Integer num: nums){
            if(num.equals(max) || num.equals(secondMax) || num.equals(thirdMax))
                continue;

            if(max == null || num > max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }else if(secondMax == null || num > secondMax ){
                thirdMax = secondMax;
                secondMax = num;
            }else if(thirdMax == null || num > thirdMax){
                thirdMax = num;
            }
        }
        return thirdMax == null? max: thirdMax;

    }

    public static void main(String[] args) {
        ThirdMaximumNumber sol = new ThirdMaximumNumber();
        System.out.println(sol.thirdMax(new int[]{2, 2, 3, 1})); // ans: 1
        System.out.println(sol.thirdMax(new int[]{1,1,2})); // ans: 2
        System.out.println(sol.thirdMax(new int[]{3, 2, 1})); // ans: 1
        System.out.println(sol.thirdMax(new int[]{1,2})); // ans: 2

    }

}
