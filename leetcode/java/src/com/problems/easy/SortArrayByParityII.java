package com.problems.easy;

import java.util.Arrays;

public class SortArrayByParityII {
    private int[] sortArrayByParityII(int[] nums) {
        return solution2(nums);
    }

    private int[] solution2(int[] nums){
        int j = 1;
        for(int i = 0; i < nums.length;i+=2){
            if(nums[i]%2 != 0 ){
                while(nums[j] %2 != 0)
                    j += 2;
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    private int[] solution1(int[] nums){
        int[] result = new int[nums.length];

        // even index
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                result[index] = nums[i];
                index += 2;
            }
        }

        index = 1;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]%2 != 0){
                result[index] = nums[i];
                index += 2;
            }
        }
        return result;
    }

    public static void main(String[] args){
        SortArrayByParityII obj  =new SortArrayByParityII();
        System.out.println(Arrays.toString(obj.sortArrayByParityII(new int[]{4,2,5,7}))); // [4,5,2,7]
    }
}
