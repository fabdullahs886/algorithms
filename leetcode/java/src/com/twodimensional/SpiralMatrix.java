package com.twodimensional;

//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//Input:
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//        Output: [1,2,3,6,9,8,7,4,5]
//
//Input:
//        [
//        [1, 2, 3, 4],
//        [5, 6, 7, 8],
//        [9,10,11,12]
//        ]
//        Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0; int bottom = matrix.length - 1; int left = 0;  int right = matrix[0].length - 1;
        System.out.println("This is " + bottom + "x" + right + " matrix");


        int j = 0;
        while(true){
            if ( left > right) break;

            for(int i = left; i <= right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            if ( top > bottom) break;
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if ( left > right) break;
            for (int i = right; i >= left;i-- ){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            if ( top > bottom) break;
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;

            if(j >= 10) {
                System.out.println("problem");
                break;
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix sol = new SpiralMatrix();

        System.out.println(sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // ans : [1,2,3,6,9,8,7,4,5]
        System.out.println(sol.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})); // ans : [1,2,3,4,8,12,11,10,9,5,6,7]
    }

}
