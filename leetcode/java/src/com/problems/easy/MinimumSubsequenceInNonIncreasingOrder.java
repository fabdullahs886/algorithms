package com.problems.easy;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    private List<Integer> minSubsequence(int[] nums) {
        int sum1 = 0, sum2 = 0;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length;i++){
            sum1 += nums[i];
        }
        System.out.println(sum1);
        Arrays.sort(nums);
        for(int i = nums.length-1; sum2 <= sum1; i--){
            sum2 += nums[i];
            sum1 -= nums[i];
            list.add(nums[i]);
        }
        return list;

    }

    public static void main(String[] args){
        MinimumSubsequenceInNonIncreasingOrder obj = new MinimumSubsequenceInNonIncreasingOrder();
        System.out.println(obj.minSubsequence(new int[]{4,3,10,9,8})); //[10,9]
        System.out.println(obj.minSubsequence(new int[]{4,4,7,6,7})); //[7,7,6]
        System.out.println(obj.minSubsequence(new int[]{6})); //[6]
    }
}
