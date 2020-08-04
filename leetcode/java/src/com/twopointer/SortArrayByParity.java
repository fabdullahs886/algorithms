package com.twopointer;
//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//        You may return any answer array that satisfies this condition.
//
//
//
//        Example 1:
//
//        Input: [3,1,2,4]
//        Output: [2,4,3,1]
//        The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
//
//        Note:
//
//        1 <= A.length <= 5000
//        0 <= A[i] <= 5000

public class SortArrayByParity {

    private int[] sortArrayByParity(int[] A) {
        int b = A.length - 1;
        int i = 0;
        while(i < b){
            if(A[i]%2 != 0 && A[b] % 2 == 0){
                int tmp = A[i];
                A[i] = A[b];
                A[b] = tmp;

            }

            if (A[i] % 2 == 0) i++;
            if (A[b] % 2 == 1) b--;
        }
        for(int a: A)
            System.out.println(a);
        return A;

    }

    public static void main(String[] args) {
        SortArrayByParity sol = new SortArrayByParity();
        System.out.println(sol.sortArrayByParity(new int[]{1,0,3})); // ans: [0,1,3]
        System.out.println(sol.sortArrayByParity(new int[]{0,1,2})); // ans: [0,2,1]
        System.out.println(sol.sortArrayByParity(new int[]{0,2})); // ans: [0,2]
        System.out.println(sol.sortArrayByParity(new int[]{3,1,2,4})); // ans: [4,2,3,1], [2,4,1,3], or [4,2,1,3]


    }

}
