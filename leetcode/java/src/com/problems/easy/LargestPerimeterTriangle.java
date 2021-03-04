package com.problems.easy;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    private int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-3 ; i>=0 ; --i){
            if(A[i]+A[i+1]>A[i+2]){
                return A[i]+A[i+1]+A[i+2];
            }
        }
        return 0;

    }

    public static void main(String[] args){
        LargestPerimeterTriangle obj = new LargestPerimeterTriangle();
//        System.out.println(obj.largestPerimeter(new int[]{2,1,2})); //5
//        System.out.println(obj.largestPerimeter(new int[]{1,2,1})); //0
//        System.out.println(obj.largestPerimeter(new int[]{3,2,3,4})); //10
        System.out.println(obj.largestPerimeter(new int[]{3,6,2,3})); //8
    }
}
