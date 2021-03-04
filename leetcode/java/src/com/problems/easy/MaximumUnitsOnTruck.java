package com.problems.easy;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    private int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> Integer.compare(b[1],a[1]));
        int count = 0;

        int result = 0;
        for(int[] boxes: boxTypes){
            for(int i = 0; i < boxes[0]; i++){
                if(count >= truckSize)
                    return result;
                result += boxes[1];
                count++;
            }

        }
        return result;
    }

    public static void main(String[] args){
        MaximumUnitsOnTruck obj = new MaximumUnitsOnTruck();
        System.out.println(obj.maximumUnits(new int[][]{{1,3},{2,2},{3,1}},4)); // 8
        System.out.println(obj.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}},10)); // 91
    }
}
