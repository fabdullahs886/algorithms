package com.problems.easy;

import java.util.*;

public class TheKWeakestRowsInMatrix {
    private int[] kWeakestRows(int[][] mat, int k) {
        int[] arr  =new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1)
                    count++;
                else
                    break;
            }
            arr[i] = count*1000 + i;
        }


        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] result = new int[k];
        for(int i = 0; i < result.length;i++){
            result[i] = arr[i]%1000;
        }

        return result;
    }

    public static void main(String[] args){
        TheKWeakestRowsInMatrix obj = new TheKWeakestRowsInMatrix();
        System.out.println(Arrays.toString(obj.kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3))); // [2,0,3]
        System.out.println(Arrays.toString(obj.kWeakestRows(new int[][]{{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}}, 3))); // [0,2,3]
    }
}
