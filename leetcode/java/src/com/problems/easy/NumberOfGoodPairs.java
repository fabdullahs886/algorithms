package com.problems.easy;

//Given an array of integers nums.
//
//        A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//
//        Return the number of good pairs.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//        Example 2:
//
//        Input: nums = [1,1,1,1]
//        Output: 6
//        Explanation: Each pair in the array are good.
//        Example 3:
//
//        Input: nums = [1,2,3]
//        Output: 0
//
//
//        Constraints:
//
//        1 <= nums.length <= 100
//        1 <= nums[i] <= 100

public class NumberOfGoodPairs {
    private int numIdenticalPairs(int[] nums) {
        solution1(nums);
        return solution2(nums);
    }

    private int solution1(int[] nums){
        int result = 0;
        if(nums == null) return result;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if (nums[i] == nums[j])
                    result++;
            }
        }

        return result;
    }

    private int solution2(int[] nums){
        int numGoodPairs = 0;
        int[] arr = new int[101];
        for(int i=0; i<nums.length; i++){
            numGoodPairs += arr[nums[i]];
            arr[nums[i]] = arr[nums[i]] + 1;
        }
        return numGoodPairs;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs obj = new NumberOfGoodPairs();

        System.out.println(obj.numIdenticalPairs(new int[]{1,2,3,1,1,3}));  //  4
        System.out.println(obj.numIdenticalPairs(new int[]{1,1,1,1}));  //  6
        System.out.println(obj.numIdenticalPairs(new int[]{1,2,3}));  //  0
    }
}
