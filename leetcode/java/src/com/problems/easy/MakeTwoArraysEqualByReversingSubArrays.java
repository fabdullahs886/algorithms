package com.problems.easy;

//Given two integer arrays of equal length target and arr.
//
//        In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.
//
//        Return True if you can make arr equal to target, or False otherwise.
//
//
//
//        Example 1:
//
//        Input: target = [1,2,3,4], arr = [2,4,1,3]
//        Output: true
//        Explanation: You can follow the next steps to convert arr to target:
//        1- Reverse sub-array [2,4,1], arr becomes [1,4,2,3]
//        2- Reverse sub-array [4,2], arr becomes [1,2,4,3]
//        3- Reverse sub-array [4,3], arr becomes [1,2,3,4]
//        There are multiple ways to convert arr to target, this is not the only way to do so.
//        Example 2:
//
//        Input: target = [7], arr = [7]
//        Output: true
//        Explanation: arr is equal to target without any reverses.
//        Example 3:
//
//        Input: target = [1,12], arr = [12,1]
//        Output: true
//        Example 4:
//
//        Input: target = [3,7,9], arr = [3,7,11]
//        Output: false
//        Explanation: arr doesn't have value 9 and it can never be converted to target.
//        Example 5:
//
//        Input: target = [1,1,1,1,1], arr = [1,1,1,1,1]
//        Output: true
//
//
//        Constraints:
//
//        target.length == arr.length
//        1 <= target.length <= 1000
//        1 <= target[i] <= 1000
//        1 <= arr[i] <= 1000

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeTwoArraysEqualByReversingSubArrays {
    private boolean canBeEqual(int[] target, int[] arr) {
//         solution1(target,arr);
        return solution2(target,arr);
    }

    private boolean solution1(int[] target, int[] arr){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < target.length;i++){
            if(map.containsKey(target[i])){
                map.put(target[i],map.get(target[i]) + 1);
            }else{
                map.put(target[i],1);
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(!map.containsKey(arr[i])) return false;

            int val = map.get(arr[i]);
            map.put(arr[i],--val);
        }
        for(int val: map.values()){
            if( val > 0)
                return false;
        }
        return true;

    }

    private boolean solution2(int[] target, int[] arr){
        Arrays.sort(arr);
        Arrays.sort(target);
        boolean result = Arrays.compare(target,arr) == 0 ? true : false;
        return result;
    }

    public static void main(String[] args){
        MakeTwoArraysEqualByReversingSubArrays obj = new MakeTwoArraysEqualByReversingSubArrays();
        System.out.println(obj.canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3})); // true
        System.out.println(obj.canBeEqual(new int[]{7}, new int[]{7})); // true
        System.out.println(obj.canBeEqual(new int[]{3,7,9}, new int[]{3,7,11})); // false
        System.out.println(obj.canBeEqual(new int[]{1,12}, new int[]{12,1})); // true
        System.out.println(obj.canBeEqual(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1})); // true
        System.out.println(obj.canBeEqual(new int[]{1,2,2,3}, new int[]{1,1,2,3})); // false
    }
}
