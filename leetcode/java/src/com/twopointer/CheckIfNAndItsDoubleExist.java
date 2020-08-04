package com.twopointer;

//Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
//
//        More formally check if there exists two indices i and j such that :
//
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
//
//
//        Example 1:
//
//        Input: arr = [10,2,5,3]
//        Output: true
//        Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
//        Example 2:
//
//        Input: arr = [7,1,14,11]
//        Output: true
//        Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
//        Example 3:
//
//        Input: arr = [3,1,7,11]
//        Output: false
//        Explanation: In this case does not exist N and M, such that N = 2 * M.
//
//
//        Constraints:
//
//        2 <= arr.length <= 500
//        -10^3 <= arr[i] <= 10^3

public class CheckIfNAndItsDoubleExist {

    private boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                if(i == j)
                    continue;
                if(2*arr[j] == arr[i])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist sol = new CheckIfNAndItsDoubleExist();
        System.out.println(sol.checkIfExist(new int[]{-20,8,-6,-14,0,-19,14,4})); // ans: false
        System.out.println(sol.checkIfExist(new int[]{-2,0,10,-19,4,6,-8})); // ans: false
        System.out.println(sol.checkIfExist(new int[]{10,2,5,3})); // ans: true
        System.out.println(sol.checkIfExist(new int[]{7,1,14,11})); // ans: true
        System.out.println(sol.checkIfExist(new int[]{3,1,7,11})); // ans: false
    }

}
