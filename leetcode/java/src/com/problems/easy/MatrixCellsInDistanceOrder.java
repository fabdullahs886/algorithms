package com.problems.easy;

public class MatrixCellsInDistanceOrder {
    private int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        return null;
    }

    public static void main(String[] args){
        MatrixCellsInDistanceOrder obj = new MatrixCellsInDistanceOrder();
        System.out.println(obj.allCellsDistOrder(1,2,0,0)); // [[0,0],[0,1]]
        System.out.println(obj.allCellsDistOrder(2,2,0,1)); // [[0,1],[0,0],[1,1],[1,0]]
        System.out.println(obj.allCellsDistOrder(2,3,1,2)); // [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
    }
}
