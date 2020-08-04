package com.array;

//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//        Note that elements beyond the length of the original array are not written.
//
//        Do the above modifications to the input array in place, do not return anything from your function.
//
//
//
//        Example 1:
//
//        Input: [1,0,2,3,0,4,5,0]
//        Output: null
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//        Example 2:
//
//        Input: [1,2,3]
//        Output: null
//        Explanation: After calling your function, the input array is modified to: [1,2,3]
//
//
//        Note:
//
//        1 <= arr.length <= 10000
//        0 <= arr[i] <= 9

public class DuplicateZeros {
    private void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length - 1;i++){
            if(arr[i] == 0){
                for( int j = arr.length - 1; j > i + 1; j--){
                    arr[j] = arr[j - 1];
                }
                i++;
                arr[i] = 0;
            }
        }
        for(int a: arr)
            System.out.println(a);
    }

    public static void main(String[] args) {
        DuplicateZeros sol = new DuplicateZeros();
        sol.duplicateZeros(new int[]{1,0,2,3,0,4,5,0}); // ans: [1,0,0,2,3,0,0,4]
        sol.duplicateZeros(new int[]{1,2,3}); // ans: [1,2,3]s
    }

}
