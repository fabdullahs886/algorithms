package com.problems.easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    private int maximumProduct(int[] nums) {
        return solution3(nums);

    }

    //find 3 biggest numbers
    private int solution2(int[] nums){
        int MIN1 = Integer.MAX_VALUE, MIN2 = Integer.MAX_VALUE;
        int MAX1 = Integer.MIN_VALUE, MAX2 = Integer.MIN_VALUE, MAX3 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] < MIN1){
                MIN2 = MIN1;
                MIN1 = nums[i];
            }else if(nums[i] < MIN2){
                MIN2 = nums[i];
            }

            if(nums[i] > MAX1){
                MAX3 = MAX2;
                MAX2 = MAX1;
                MAX1 = nums[i];
            }else if(nums[i] > MAX2){
                MAX3 = MAX2;
                MAX2 = nums[i];
            }else if(nums[i] > MAX3){
                MAX3 = nums[i];
            }
        }
        return Math.max(MIN1*MIN2*MAX1, MAX1*MAX2*MAX3);
    }

    private int solution3(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1]*nums[len-2]*nums[len-3]);

    }

    private int solution1(int[] nums){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length;k++){
                    if(nums[i]*nums[j]*nums[k] > result)
                        result = nums[i]*nums[j]*nums[k];
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        MaximumProductOfThreeNumbers obj  = new MaximumProductOfThreeNumbers();
        System.out.println(obj.maximumProduct(new int[]{-1,-2,-3})); // -6
        System.out.println(obj.maximumProduct(new int[]{1,2,3})); // 6
        System.out.println(obj.maximumProduct(new int[]{1,2,3,4})); // 24
        System.out.println(obj.maximumProduct(new int[]{-100,-98,-1,2,3,4})); // 39200
    }
}
