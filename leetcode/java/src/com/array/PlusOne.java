package com.array;

// Category : Easy
//Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
//
//        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//
//        You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//        Example 1:
//
//        Input: [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Example 2:
//
//        Input: [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321

import java.math.BigInteger;

public class PlusOne {

    private int[] plusOne(int[] digits) {

        BigInteger num = new BigInteger("0");
        for ( int digit: digits ){
            num = num.multiply(new BigInteger("10"));
            num = num.add(new BigInteger(String.valueOf(digit)));
        }

        num = num.add(new BigInteger("1"));
        System.out.println("num = " + num);

        int[] nums = new int[String.valueOf(num).length()];
        for(int i = 0; i < nums.length; i++){
            BigInteger tmp = num.mod(new BigInteger("10"));
            nums[nums.length - 1 - i] = tmp.intValue();
            num = num.divide(new BigInteger("10"));
        }

        for(int n: nums)
            System.out.println(n);

        return nums;

//////////// Same solution below for smaller number which fits in long range //////////////

//        long num = 0, number = 1;
//
//
//        for ( int digit: digits ){
//            num *= 10;
//            num += digit;
//        }
//        num++;
//        System.out.println("num = " + num);
//
//        int[] nums = new int[String.valueOf(num).length()];
//        for(int i = 0; i < nums.length; i++){
//            long tmp = num%10;
//            nums[nums.length - 1 - i] = (int)tmp;
//            num /= 10;
//        }
//
//        for(int n: nums)
//            System.out.println(n);
//
//        return nums;
    }

    public static void main(String[] args) {
        PlusOne sol = new PlusOne();

        System.out.println(sol.plusOne(new int[]{1,2,3})); // ans : [1,2,4]
//        The array represents the integer 123.

        System.out.println(sol.plusOne(new int[]{4,3,2,1})); // ans : [4,3,2,2]
//        The array represents the integer 4321.

        System.out.println(sol.plusOne(new int[]{9})); // ans : [1,0]
//        The array represents the integer 9.

        System.out.println(sol.plusOne(new int[]{9,9})); // ans : [1,0,0]
//        The array represents the integer 99.

        System.out.println(sol.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})); // ans : [9,8,7,6,5,4,3,2,1,1]
//        The array represents the integer 9876543210.

        System.out.println(sol.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})); // ans : [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7]
//        The array represents the integer [728509129536673284379577474947011174006.


//        long i = 9876543210L;
//        System.out.println(i%10);

    }
}
