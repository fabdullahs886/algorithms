package com.problems.easy;

public class CalculateMoneyInLeetcodeBank {
    private int totalMoney(int n) {
        int sum = 0;
        int start = 1;
        int count = 1;
        for(int i = 1; i <= n; i++){
            sum += count;
            count++;
            if(i%7 == 0){
                start++;
                count = start;
            }


        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank obj = new CalculateMoneyInLeetcodeBank();
        System.out.println(obj.totalMoney(10));
    }

}
