package com.problems.easy;

// Category : Easy
//You are climbing a stair case. It takes n steps to reach to the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//        Example 1:
//
//        Input: 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
//        Example 2:
//
//        Input: 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step
//
//
//        Constraints:
//
//        1 <= n <= 45

public class ClimbingStairs {


    private int climbStairs(int n) {
        int result = solution1(0,n);
        System.out.println("Solution 1 : " + result);

        int[] memo = new int[n + 1];
        result = solution2(0,n,memo);
        System.out.println("Solution 2 : " + result);

        result = solution3(n);
        System.out.println("Solution 3 : " + result);
        return result;
    }

    private int solution3(int n){
        if(n == 1)
            return 1;

        int[] dp  =new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return  dp[n];
    }

    private int solution2(int i,int n, int[] memo){
        if(i > n)
            return 0;

        if(i == n)
            return i;

        if(memo[i] > 0)
            return memo[i];

        memo[i] = solution2(i+1, n, memo) + solution2(i + 2, n, memo);

        return memo[i];
    }

    //Brute force
    private int solution1(int i, int n){
        if( i > n)
            return 0;

        if( i == n)
            return 1;

        return solution1(i+1,n) + solution1(i+2,n);
    }

    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        obj.climbStairs(2); // ans: 2
        obj.climbStairs(3); // ans: 3
    }

}
