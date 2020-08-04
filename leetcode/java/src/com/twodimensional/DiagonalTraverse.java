package com.twodimensional;

//Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
//      [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//      ]
//
// Output:  [1,2,4,7,5,3,6,8,9]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("This is " + m + "x" + n + " matrix");

        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();


        for( int i =0; i < m ; i++){
            for (int j = 0; j < n ; j++){
                if(map.get(i + j) == null)
                    map.put(i + j, new ArrayList<Integer>());

                map.get(i + j).add(matrix[i][j]);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            Integer key = entry.getKey();
            List<Integer> list = entry.getValue();
            if (key%2 == 0){
                for(int i = list.size() - 1; i >= 0 ;i--){
                    result.add(list.get(i));
                }
            }else{
                for(int i = 0; i < list.size();i++){
                    result.add(list.get(i));
                }
            }

        }

        for(int i = 0; i < result.size();i++){
            System.out.println(result.get(i));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        DiagonalTraverse sol = new DiagonalTraverse();

        System.out.println(sol.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // ans : [1,2,4,7,5,3,6,8,9]
//        The array represents the integer 123.



    }
}
