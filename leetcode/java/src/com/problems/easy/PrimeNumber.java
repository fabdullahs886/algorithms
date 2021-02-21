package com.problems.easy;

public class PrimeNumber {
    private void showPrime(int n){

        for(int i = 1;i <= n; i++){
            int count = 0;
            for(int num = i; num >= 1; num-- ){
                if(i%num == 0){
                    count++;
                }
            }
            if(count  == 2)
                System.out.println("Prime Number: " + i);
        }
    }

    public static void main(String[] args){
        PrimeNumber obj = new PrimeNumber();
        obj.showPrime(5); // 2,3,5
        obj.showPrime(100); // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
    }
}
