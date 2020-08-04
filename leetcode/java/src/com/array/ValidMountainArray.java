package com.array;

//Given an array A of integers, return true if and only if it is a valid mountain array.
//
//        Recall that A is a mountain array if and only if:
//
//        A.length >= 3
//        There exists some i with 0 < i < A.length - 1 such that:
//        A[0] < A[1] < ... A[i-1] < A[i]
//        A[i] > A[i+1] > ... > A[A.length - 1]
//
//
//
//
//        Example 1:
//
//        Input: [2,1]
//        Output: false
//        Example 2:
//
//        Input: [3,5,5]
//        Output: false
//        Example 3:
//
//        Input: [0,3,2,1]
//        Output: true
//
//
//        Note:
//
//        0 <= A.length <= 10000
//        0 <= A[i] <= 10000

import com.twopointer.CheckIfNAndItsDoubleExist;

public class ValidMountainArray {

    private boolean validMountainArray(int[] A) {

        //solution 1
//        if(A == null || A.length < 3) return false;
//        if(A[0] >= A[1] || A[A.length - 2] <= A[A.length - 1]) return false;
//        boolean up = true;
//
//        for(int i = 1; i < A.length; i++){
//            if(up){
//                if(A[i] < A[i - 1]) up = false;
//                else if(A[i] == A[i - 1]) return false;
//            }else{
//                if(A[i] >= A[i - 1]) return false;
//            }
//        }
//        return true;

        //solution 2
        int N = A.length;
        int i = 0;

        // Walk up
        while(i + 1 < N && A[i] < A[i + 1])
            i++;
        // peak can't be first or last
        if(i == 0 || i == N -1)
            return false;

        // walk down
        while(i + 1 < N && A[i] > A[i+1])
            i++;

        return i == N -1;

    }

    public static void main(String[] args) {
        ValidMountainArray sol = new ValidMountainArray();
        System.out.println(sol.validMountainArray(new int[]{0,3,2,1})); // ans: true
        System.out.println(sol.validMountainArray(new int[]{2,1})); // ans: false
        System.out.println(sol.validMountainArray(new int[]{3,5,5})); // ans: false

    }

}
