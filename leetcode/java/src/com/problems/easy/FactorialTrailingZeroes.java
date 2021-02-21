package com.problems.easy;

public class FactorialTrailingZeroes {
    private int trailingZeroes(int n) {
//        int p = 5;
//        int count = 0;
//        while(n/p > 0){
//            count = n/p;
//            p *= 5;
//        }
//        return count;

        int count = 0;
        for(int i = 5; i <= n; i *=5){
            count += n/i;
        }
        return count;
    }

    public static void main(String[] args){
        FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
        System.out.println(obj.trailingZeroes(3)); // 0
        System.out.println(obj.trailingZeroes(5)); // 1
        System.out.println(obj.trailingZeroes(8)); // 1
        System.out.println(obj.trailingZeroes(0)); // 0
        System.out.println(obj.trailingZeroes(30)); // 7
    }
}
