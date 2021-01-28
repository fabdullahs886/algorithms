package com.problems.easy;

//Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
//        A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//
//
//
//        Example 1:
//
//        Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//        Output: [15]
//        Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
//        Example 2:
//
//        Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//        Output: [12]
//        Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
//        Example 3:
//
//        Input: matrix = [[7,8],[1,2]]
//        Output: [7]
//
//
//        Constraints:
//
//        m == mat.length
//        n == mat[i].length
//        1 <= n, m <= 50
//        1 <= matrix[i][j] <= 10^5.
//        All elements in the matrix are distinct.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInMatrix {

    private List<Integer> luckyNumbers (int[][] matrix) {
//        int[] arr = new int[matrix.length];
//        for(int i = 0; i < matrix.length;i++){
//            int min = Integer.MAX_VALUE;
//            for(int num: matrix[i]){
//                if(num < min)
//                    min = num;
//            }
//            arr[i] = min;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] > max)
//                max = arr[i];
//        }
//
//        List<Integer> result = new ArrayList<Integer>();
//        result.add(max);
//        return result;

        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        List<Integer> minRowValue = new ArrayList<>();
        List<Integer> maxColValue = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++){
                min = Math.min(min, matrix[i][j]);
            }
            minRowValue.add(min);
        }


        for (int j = 0; j < matrix[0].length; j++){
            max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++){
                max = Math.max(max, matrix[i][j]);
            }
            maxColValue.add(max);
        }


        for (int i = 0; i < minRowValue.size() ; i++){
            if (minRowValue.contains(minRowValue.get(i)) && maxColValue.contains(minRowValue.get(i))){
                result.add(minRowValue.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args){
        LuckyNumbersInMatrix obj = new LuckyNumbersInMatrix();
//        System.out.println(obj.luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));    //  [15]
//        System.out.println(obj.luckyNumbers(new int[][]{{1,10,4,2},{1,10,4,2},{15,16,17,12}}));    //  [12]
//        System.out.println(obj.luckyNumbers(new int[][]{{7,8},{1,2}}));    //  [7]
        System.out.println(obj.luckyNumbers(new int[][]{{36376,85652,21002,4510},{36376,85652,21002,4510},{32768,97721,47338,5841},{55103,18179,79062,46542}}));    //  []
    }
}
