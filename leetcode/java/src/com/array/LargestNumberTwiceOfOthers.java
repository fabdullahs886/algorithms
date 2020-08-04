package com.array;

//In a given integer array nums, there is always exactly one largest element.
//
//Find whether the largest element in the array is at least twice as much as every other number in the array.
//
//If it is, return the index of the largest element, otherwise return -1.
//
// Ref: https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/

public class LargestNumberTwiceOfOthers {

    private int dominantIndex(int[] nums) {


        // FInd largest number
        int largestNumber = 0, largestNumberIndex = -1;
        for ( int i = 0; i < nums.length; i++){
            if ( nums[i] > largestNumber) {
                largestNumber = nums[i];
                largestNumberIndex = i;
            }
        }
//        System.out.println("Largest Number : " + largestNumber);

        for(int i = 0; i < nums.length; i++){
            if ( nums[i] == largestNumber)
                continue;;

            if ( largestNumber < 2*nums[i] ) {
//                largestNumberIndex = i;
                return -1;
            }
        }
        return largestNumberIndex;
    }

    public static void main(String[] args) {
        LargestNumberTwiceOfOthers sol = new LargestNumberTwiceOfOthers();

        System.out.println(sol.dominantIndex(new int[]{1})); // ans : 0

        System.out.println(sol.dominantIndex(new int[]{3, 6, 1, 0})); // ans : 1
        // 6 is the largest integer, and for every other number in the array x,
        // 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1

        System.out.println(sol.dominantIndex(new int[]{1, 2, 3, 4})); // ans : -1.
        // 4 isn't at least as big as twice the value of 3, so we return -1.

        System.out.println(sol.dominantIndex(new int[]{0, 0, 0, 1})); // ans : 3.
        // 4 isn't at least as big as twice the value of 3, so we return -1.




    }

}
