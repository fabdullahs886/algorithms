package com.problems.easy;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21
//        Note:
//        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
//        For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows

public class ReverseInteger {

    private int reverse(int x) {

        if (x == 0) return 0;
        long rev  = 0l;
        while(x != 0){
            int num = x%10;
            x /= 10;
            rev = rev*10 + num;
        }
        if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int)rev;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(1534236469)); //ans: 0
        System.out.println(obj.reverse(123)); //ans: 321
        System.out.println(obj.reverse(-123)); //ans: -321
        System.out.println(obj.reverse(120)); //ans: 21
    }

}
