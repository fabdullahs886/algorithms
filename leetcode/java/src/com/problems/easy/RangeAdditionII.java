package com.problems.easy;

import java.util.Arrays;

public class RangeAdditionII {
    private int maxCount(int m, int n, int[][] ops) {
        int minX = Integer.MAX_VALUE; int minY = Integer.MAX_VALUE;
        for(int i = 0; i < ops.length;i++){
            minX = Math.min(minX,ops[i][0]);
            minY = Math.min(minY,ops[i][1]);
        }
        return minX*minY;

//        int[][] arr = new int[m][n];
//        for (int[] op: ops) {
//            for (int i = 0; i < op[0]; i++) {
//                for (int j = 0; j < op[1]; j++) {
//                    arr[i][j] += 1;
//                }
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == arr[0][0])
//                    count++;
//            }
//        }
//        return count;

    }

    public static void main(String[] args){
        RangeAdditionII obj = new RangeAdditionII();
        System.out.println(obj.maxCount(3,3,new int[][]{{2,2},{3,3}})); //4
        System.out.println(obj.maxCount(3,3,new int[][]{{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}})); //4
        System.out.println(obj.maxCount(3,3,new int[][]{})); //9
//        System.out.println(obj.maxCount(40000,40000,new int[][]{})); //9
        System.out.println(obj.maxCount(39999,39999,new int[][]{{19999,19999}})); //399960001
    }
}
