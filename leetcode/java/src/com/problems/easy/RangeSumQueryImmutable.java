package com.problems.easy;

public class RangeSumQueryImmutable {
    private int[] data;

    private RangeSumQueryImmutable(int[] nums) {
        data = nums;
    }
    private int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k++){
            sum += data[k];
        }
        return sum;
    }

    public static void main(String[] args){
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(0,2)); //1
        System.out.println(obj.sumRange(2,5)); // -1
        System.out.println(obj.sumRange(0,5)); // -3
    }
}
