package com.problems.easy;

import java.util.Arrays;

public class FlippingAnImage {
    private int[][] flipAndInvertImage(int[][] A) {
        for(int[] arr: A){
            int a = 0, b = A.length-1;
            while(b > a) {
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
                a++;
                b--;
            }
        }
        for(int[] arr: A){
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == 0)
                    arr[i] = 1;
                else
                    arr[i] = 0;
            }
        }

//        System.out.println(Arrays.deepToString(A));
        return A;
    }

    public static void main(String[] args) {
        FlippingAnImage obj = new FlippingAnImage();
        System.err.println(Arrays.deepToString(obj.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0} }))); //  [[1,0,0],[0,1,0],[1,1,1]]
        System.err.println(Arrays.deepToString(obj.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0} }))); //  [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    }
}
