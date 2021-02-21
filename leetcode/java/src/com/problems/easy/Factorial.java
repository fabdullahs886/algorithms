package com.problems.easy;

public class Factorial {
    private int factorial(int n){
        return solution1(n);

    }

    private int solution1(int n){
        long fact = 1;
        for(int i = 1; i <=n;i++){
            fact = fact*i;
        }
        return (int) fact;
    }
    private int solution2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n*factorial(n-1);
    }


    public static void main(String[] args){
        Factorial obj   = new Factorial();
        System.out.println(obj.factorial(30)); // 6
        System.out.println(obj.factorial(4)); // 24
    }
}
