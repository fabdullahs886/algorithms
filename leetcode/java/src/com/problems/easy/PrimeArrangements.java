package com.problems.easy;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimeArrangements {
    private int numPrimeArrangements(int n) {
        int MOD = 1000000007;
        int primeCount = getPrimeCount(n);
        System.out.println("PrimeCount: " + primeCount);
        int nonPrimeCount = n - primeCount;
        System.out.println("NonPrimeCount: " + nonPrimeCount);

        long fact = 1;
        for(int i = 1; i <= primeCount;i++){
            fact = (fact*i)%1000000007;
        }
        for(int i = 1; i <= nonPrimeCount;i++){
            fact = (fact*i)%1000000007;
        }
        return (int) fact;
    }

    private int getPrimeCount(int n){
        int primeCount = 0;
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int num = i; num >= 1; num--){
                if(i%num == 0)
                    count++;
            }
            if(count == 2)
                primeCount++;
        }
        return primeCount;
    }

    public static void main(String[] args){
        PrimeArrangements obj  = new PrimeArrangements();
//        System.out.println(obj.numPrimeArrangements(5)); // 12
//        System.out.println(obj.numPrimeArrangements(100)); // 682289015
        System.out.println(obj.numPrimeArrangements(1)); // 1
    }
}
