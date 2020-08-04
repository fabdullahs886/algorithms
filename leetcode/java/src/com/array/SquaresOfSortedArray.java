package com.array;

//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
//
//
//
//        Example 1:
//
//        Input: [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Example 2:
//
//        Input: [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]
//
//
//        Note:
//
//        1 <= A.length <= 10000
//        -10000 <= A[i] <= 10000
//        A is sorted in non-decreasing order.

import java.util.Arrays;

public class SquaresOfSortedArray {

    private int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);

        for(int a: A)
            System.out.println(a);
        return A;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray sol = new SquaresOfSortedArray();
        System.out.println(sol.sortedSquares(new int[]{-4,-1,0,3,10})); // ans: [0,1,9,16,100]
        System.out.println(sol.sortedSquares(new int[]{-7,-3,2,3,11})); // ans: [4,9,9,49,121]
    }

}
