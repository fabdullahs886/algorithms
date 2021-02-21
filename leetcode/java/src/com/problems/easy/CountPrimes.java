package com.problems.easy;

import java.util.Arrays;

public class CountPrimes {
    private int countPrimes(int n) {
        if ( n == 0 || n == 1) return 0;

        int primeCount = 0;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes,0,n, true);
        for(int i = 2; i*i < primes.length; i++){
            if(primes[i] == true){
                for(int j = i; j * i < primes.length; j++){
                    primes[i*j] = false;
                }
            }
        }
        for(int i = 2; i < primes.length; i++){
            if(primes[i] == true)
                primeCount++;
        }
        return primeCount;
//        boolean[] prime = new boolean[n + 1];
//        Arrays.fill(prime, 0, n, true);
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p])
//                for (int i = p * p; i <= n; i += p)
//                    prime[i] = false;
//        }
//        int ct = 0;
//        for (int i = 2; i <= n; i++)
//            if (prime[i])
//                ct++;
//        return ct;

    }

    public static void main(String[] args){
        CountPrimes obj = new CountPrimes();
        System.out.println(obj.countPrimes(3)); // 1
        System.out.println(obj.countPrimes(10)); // 4
        System.out.println(obj.countPrimes(0)); // 0
        System.out.println(obj.countPrimes(1)); // 0
    }
}
