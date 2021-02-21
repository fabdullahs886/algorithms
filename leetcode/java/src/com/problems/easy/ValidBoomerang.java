package com.problems.easy;

public class ValidBoomerang {
    private boolean isBoomerang(int[][] points) {
        int[] a = points[0];
        int[] b = points[1];
        int[] c = points[2];

        int area = (a[0]*(b[1] - c[1]) + b[0]*(c[1] - a[1]) + c[0]*(a[1] - b[1]));
        System.out.println(area);
        if(area != 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        ValidBoomerang obj = new ValidBoomerang();
        System.out.println(obj.isBoomerang(new int[][]{{0,0},{1,2},{0,1}}));// true
    }
}
