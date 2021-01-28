package com.problems.easy;

public class MinimumCostToMoveChipsToSamePosition {
    private int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int pos: position){
            if(pos % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd, even);
    }

    public static void main(String[] args){
        MinimumCostToMoveChipsToSamePosition obj = new MinimumCostToMoveChipsToSamePosition();
        System.out.println(obj.minCostToMoveChips(new int[]{1,2,3})); // 1
        System.out.println(obj.minCostToMoveChips(new int[]{2,2,2,3,3})); // 2
        System.out.println(obj.minCostToMoveChips(new int[]{1,1000000000})); // 1
    }


}
