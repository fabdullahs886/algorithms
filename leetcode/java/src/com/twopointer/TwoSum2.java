package com.twopointer;

//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//        The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//
//        Note:
//
//        Your returned answers (both index1 and index2) are not zero-based.
//        You may assume that each input would have exactly one solution and you may not use the same element twice.
//        Example:
//
//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

public class TwoSum2 {

    private int[] twoSum(int[] numbers, int target) {
        int a = 0; int b = numbers.length - 1;
        while(a <= b) {
            int sum = numbers[a] + numbers[b];
            if (sum > target) {
                b = b - 1;
            } else if (sum < target) {
                a = a + 1;
            } else {
//                System.out.println(++a + ": " + ++b);
                return new int[]{++a, ++b};
            }

        }
        return new int[]{++a, ++b};

//        Solution 2
//        for(int i = 0; i < numbers.length;i++){
//            for(int j = i+1;j < numbers.length;j++){
//                if(numbers[i] + numbers[j] == target){
//                    System.out.println(++i + " : " + ++j);
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
    }

    public static void main(String[] args) {
        TwoSum2 sol = new TwoSum2();
        System.out.println(sol.twoSum(new int[]{2,7,11,15},9)); // ans: 1,2
        System.out.println(sol.twoSum(new int[]{0,0,3,4},0)); // ans: 1,2
        System.out.println(sol.twoSum(new int[]{2,7,11,15},9)); // ans: 1,2

    }
}
