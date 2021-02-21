package com.problems.easy;

public class CheckIfItIsStraightLine {
    private boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        for (int i = 1; i < coordinates.length - 1;i++){
            int curx = coordinates[i+1][0] - coordinates[i][0];
            int cury = coordinates[i+1][1] - coordinates[i][1];
            if(dx*cury != dy*curx)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        CheckIfItIsStraightLine obj = new CheckIfItIsStraightLine();
        System.out.println(obj.checkStraightLine(new int[][]{{0,0},{0,5},{5,5},{5,0}})); // false
//        System.out.println(obj.checkStraightLine(new int[][]{{1,1},{2,2},{2,0}})); // false
    }
}
