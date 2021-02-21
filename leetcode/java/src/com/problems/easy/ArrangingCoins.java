package com.problems.easy;

public class ArrangingCoins {
    private int arrangeCoins(int n) {
        if(n == 0) return 0;
        int i = 1, num = n;
        while(true){
            num = num - i;
            if(num <= i)
                break;
            i++;
        }
        return i;

    }

    public static void main(String[] args){
        ArrangingCoins obj = new ArrangingCoins();
        System.out.println(obj.arrangeCoins(6)); // 1
    }
}
