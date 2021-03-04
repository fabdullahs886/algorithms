package com.problems.easy;

public class MinCostClimbingStairs {

    private int minCostClimbingStairs(int[] cost) {
        return solution1(cost);
    }

    private int solution1(int[] cost){
        int f1 = 0, f2 = 0;
        for(int i =cost.length - 1; i >= 0; i--){
            int f0 = cost[i] + Math.min(f1,f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1,f2);
    }

    private int solution2(int[] cost){
        if (cost == null || cost.length < 1) return 0;
        int n = cost.length;
        int[] dp = new int[n];  // cost to reach till ith step
        for (int i = 2; i < n; i++) {
            // cost to reach ith step could be climb 2 from i-2 or climb 1 from i-1 step
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        // finally to climb all n steps either climb 2 from second last step or climb 1 from last step
        return Math.min(dp[n-2] + cost[n-2], dp[n-1] + cost[n-1]);
    }

    public static void main(String[] args){
        MinCostClimbingStairs obj = new MinCostClimbingStairs();
        System.out.println(obj.minCostClimbingStairs(new int[]{10, 15, 20})); // 15
        System.out.println(obj.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); // 6
    }
}
