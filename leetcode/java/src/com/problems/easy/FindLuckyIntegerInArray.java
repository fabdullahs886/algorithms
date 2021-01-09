package com.problems.easy;


//Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
//
//        Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
//
//
//
//        Example 1:
//
//        Input: arr = [2,2,3,4]
//        Output: 2
//        Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//        Example 2:
//
//        Input: arr = [1,2,2,3,3,3]
//        Output: 3
//        Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//        Example 3:
//
//        Input: arr = [2,2,2,3,3]
//        Output: -1
//        Explanation: There are no lucky numbers in the array.
//        Example 4:
//
//        Input: arr = [5]
//        Output: -1
//        Example 5:
//
//        Input: arr = [7,7,7,7,7,7,7]
//        Output: 7
//
//
//        Constraints:
//
//        1 <= arr.length <= 500
//        1 <= arr[i] <= 500

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInArray {
    private int findLucky(int[] arr) {
        int result = -1;;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(Integer num: map.keySet()){
            if ( num == map.get(num)){
                if(num > result)
                    result = num;
            }
        }
        return result;

//        int[] num = new int[502];
//        int res = 0;
//        for(int i = 0; i < arr.length; i++)
//            num[arr[i]]++;
//        for(int i = 0; i < num.length; i++)
//            if(num[i] == i)
//                res = Math.max(res, i);
//        return res > 0 ? res : -1;
    }

    public static void main(String[] args){
        FindLuckyIntegerInArray obj = new FindLuckyIntegerInArray();
        System.out.println(obj.findLucky(new int[]{2,2,3,4})); // 2
        System.out.println(obj.findLucky(new int[]{1,2,2,3,3,3})); // 3
        System.out.println(obj.findLucky(new int[]{2,2,2,3,3})); // -1
        System.out.println(obj.findLucky(new int[]{5})); // -1
        System.out.println(obj.findLucky(new int[]{7,7,7,7,7,7,7})); // 7
    }
}
