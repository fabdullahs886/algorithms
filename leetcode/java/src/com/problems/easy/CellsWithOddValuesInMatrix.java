package com.problems.easy;

import java.util.Arrays;

//Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
//
//        Return the number of cells with odd values in the matrix after applying the increment to all indices.
//
//
//
//        Example 1:
//
//
//        Input: n = 2, m = 3, indices = [[0,1],[1,1]]
//        Output: 6
//        Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//        After applying first increment it becomes [[1,2,1],[0,1,0]].
//        The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
//        Example 2:
//
//
//        Input: n = 2, m = 2, indices = [[1,1],[0,0]]
//        Output: 0
//        Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.
//
//
//        Constraints:
//
//        1 <= n <= 50
//        1 <= m <= 50
//        1 <= indices.length <= 100
//        0 <= indices[i][0] < n
//0 <= indices[i][1] < m
//
public class CellsWithOddValuesInMatrix {
    private int oddCells(int n, int m, int[][] indices) {
//        return solution1(n,m,indices);
        return solution2(n,m,indices);
    }

    private int solution1(int n, int m, int[][] indices) {
        int result = 0;
        if(n == 0 && m == 0) return result;
        int[][] arr = new int[n][m];

        for(int i = 0; i < indices.length; i++){
            int row = indices[i][0];
            int col = indices[i][1];
            for(int j = 0; j < m; j++){
                arr[row][j] += 1;
            }
            for(int j = 0; j < n; j++){
                arr[j][col] +=1;
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                if( arr[i][j]%2 != 0)
                    result++;
            }
        }
        return result;
    }

    private int solution2(int n, int m, int[][] indices){
        int ans = 0;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int k = 0; k < indices.length; k++) {
            cols[indices[k][1]]++;
            rows[indices[k][0]]++;
        }
//        System.out.println(Arrays.toString(rows));
//        System.out.println(Arrays.toString(cols));
//        System.out.println("-----------------");

        int oddRows = 0;
        for (int i = 0; i  < n; i++) {
            if (rows[i] % 2 != 0) {
                oddRows++;
                ans += m; // add all items of the odd row first, if column is odd, deduct later
            }
        }

        for (int j = 0; j < m; j++) {
            if (cols[j] % 2 != 0) {
                ans -= oddRows; // if odd row and odd column, should be even, so need to deduct
                ans += n - oddRows; // for even row and odd column, should be added
            }
        }
        return ans;
    }

    public static void main(String[] args){
        CellsWithOddValuesInMatrix obj = new CellsWithOddValuesInMatrix();
        System.out.println(obj.oddCells(2,3,new int[][]{{0,1},{1,1}})); // 6
        System.out.println(obj.oddCells(2,2,new int[][]{{1,1},{0,0}})); // 0
    }
}
