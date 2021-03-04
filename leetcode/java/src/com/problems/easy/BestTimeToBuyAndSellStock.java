package com.problems.easy;

public class BestTimeToBuyAndSellStock {
    private int maxProfit(int[] prices) {
        return solution2(prices);
    }

    private int solution2(int[] prices){
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) {
                min = prices[i];
            }else{
                int diff = prices[i] - min;
                if(diff > profit)
                    profit = diff;
            }
        }
        return profit;
    }

    private int solution1(int[] prices){
        int profit = 0;
        for(int i = 0; i < prices.length;i++){
            for(int j = i+1; j < prices.length;j++){
                int diff = prices[j] - prices[i];
                if(diff > profit)
                    profit = diff;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(obj.maxProfit(new int[]{7,6,4,3,1})); // 0
        System.out.println(obj.maxProfit(new int[]{2,4,1})); // 2

    }
}
