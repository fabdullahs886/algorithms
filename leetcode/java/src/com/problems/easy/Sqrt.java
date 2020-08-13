package com.problems.easy;

// Category : Easy
//Implement int sqrt(int x).
//
//        Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
//
//        Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
//
//        Example 1:
//
//        Input: 4
//        Output: 2
//        Example 2:
//
//        Input: 8
//        Output: 2
//        Explanation: The square root of 8 is 2.82842..., and since
//        the decimal part is truncated, 2 is returned.

public class Sqrt {
    private int mySqrt(int x) {
        int result = solution1(x);
        result = solution2(x);
        return result;
    }

    private int solution1(int x){
        return (int)Math.sqrt(x);
    }

    private int solution2(int x){
        int low = 1;
        int high = x;
        while( low <= high){
            int mid = (low+high)/2;
            if(mid == x/mid)
                return mid;
            if(mid < x/mid)
                low = mid + 1;
            if(mid > x/mid)
                high = mid - 1;
        }
        return high;
    }

    public static void main(String[] args) {
        Sqrt obj = new Sqrt();
        System.out.println(obj.mySqrt(4)); // ans: 2
        System.out.println(obj.mySqrt(8)); // ans: 2
        System.out.println(obj.mySqrt(9)); // ans: 3
    }
}
