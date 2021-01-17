package com.problems.easy;

//Given an integer n, return any array containing n unique integers such that they add up to 0.
//
//
//
//        Example 1:
//
//        Input: n = 5
//        Output: [-7,-1,1,3,4]
//        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
//        Example 2:
//
//        Input: n = 3
//        Output: [-1,0,1]
//        Example 3:
//
//        Input: n = 1
//        Output: [0]
//
//
//        Constraints:
//
//        1 <= n <= 1000

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    private int[] sumZero(int n) {
        int[] result = new int[n];
        for(int i=0; i < n-1; i=i+2)
        {
            result[i] = i+1;
            result[i+1] = -result[i];
        }
        return result;
    }
    
    public static void main(String[] args){
        FindNUniqueIntegersSumUpToZero obj = new FindNUniqueIntegersSumUpToZero();
        System.out.println(Arrays.toString(obj.sumZero(5))); // [-7,-1,1,3,4] or any other array
        System.out.println(Arrays.toString(obj.sumZero(3))); // [-1,0,1] or any other array
        System.out.println(Arrays.toString(obj.sumZero(1))); // [0] or any other array

    }
}
