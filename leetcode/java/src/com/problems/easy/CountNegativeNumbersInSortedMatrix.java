package com.problems.easy;

//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
//
//
//
//        Example 1:
//
//        Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//        Output: 8
//        Explanation: There are 8 negatives number in the matrix.
//        Example 2:
//
//        Input: grid = [[3,2],[1,0]]
//        Output: 0
//        Example 3:
//
//        Input: grid = [[1,-1],[-1,-1]]
//        Output: 3
//        Example 4:
//
//        Input: grid = [[-1]]
//        Output: 1
//
//
//        Constraints:
//
//        m == grid.length
//        n == grid[i].length
//        1 <= m, n <= 100
//        -100 <= grid[i][j] <= 100

public class CountNegativeNumbersInSortedMatrix {
    private int countNegatives(int[][] grid) {
        if(grid == null) return 0;

        int count=0;
        for(int[] arr: grid){
            for(int i = 0; i < arr.length;i++){
                if(arr[i] < 0)
                    count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        CountNegativeNumbersInSortedMatrix obj = new CountNegativeNumbersInSortedMatrix();
        System.out.println(obj.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})); // 8
        System.out.println(obj.countNegatives(new int[][]{{3,2},{1,0}})); // 0
        System.out.println(obj.countNegatives(new int[][]{{1,-1},{-1,-1}})); // 3
    }
}
