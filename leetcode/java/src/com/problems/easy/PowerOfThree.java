package com.problems.easy;

public class PowerOfThree {
    private boolean isPowerOfThree(int n) {
       return solution2(n);
    }

    private boolean solution2(int n){
        if(n == 0) return false;

        while(n%3 == 0){
            n /= 3;
        }
        return (n == 1);
    }
    private boolean solution1(int n){
        if(n == 0) return false;

        int i = 0;
        while(true){
            if(Math.pow(3,i) == n)
                return true;
            if(Math.pow(3,i) > n)
                return false;
            i++;
        }
    }

    public static void main(String[] args){
        PowerOfThree obj = new PowerOfThree();
        System.out.println(obj.isPowerOfThree(27)); // true
        System.out.println(obj.isPowerOfThree(0)); // false
        System.out.println(obj.isPowerOfThree(9)); // true
    }
}
