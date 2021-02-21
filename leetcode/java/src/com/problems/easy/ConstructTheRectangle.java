package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructTheRectangle {
    private int[] constructRectangle(int area) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= area; i++){
            if(area%i == 0){
                int[] factors = new int[2];
                int factor1 = area/i;
                int factor2 = i;
                int diff = Math.abs(factor1 - factor2);
                if(min > diff){
                    if(factor1 > factor2){
                        result[0] = factor1;
                        result[1] = factor2;
                    }else{
                        result[0]  = factor2;
                        result[1]  = factor1;
                    }
                    min = diff;
                }

            }
        }
        return result;
    }

    public static void main(String[] args){
        ConstructTheRectangle obj = new ConstructTheRectangle();
        System.out.println(Arrays.toString(obj.constructRectangle(1))); // [1,1]
        System.out.println(Arrays.toString(obj.constructRectangle(4))); // [2,2]
        System.out.println(Arrays.toString(obj.constructRectangle(37))); // [37,1]
        System.out.println(Arrays.toString(obj.constructRectangle(122122))); // [427,286]
    }
}
