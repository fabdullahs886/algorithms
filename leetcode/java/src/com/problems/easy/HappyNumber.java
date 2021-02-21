package com.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    private boolean isHappy(int n) {
        Set<Integer> set  = new HashSet();
        set.add(n);
        while(true){
            int len = String.valueOf(n).length();
            int sum = 0;
            for(int i = 0; i < len; i++) {
                int digit = n % 10;
                n = n / 10;
                sum += (digit * digit);
            }
            n = sum;
            if(n == 1)
                return true;
            if(set.contains(n))
                return false;
            set.add(n);
        }
    }

    public static void main(String[] args){
        HappyNumber obj = new HappyNumber();
//        System.out.println(obj.isHappy(19)); // true
//        System.out.println(obj.isHappy(2)); // false
//        System.out.println(obj.isHappy(7)); // true
//        System.out.println(obj.isHappy(4)); // false
        System.out.println(obj.isHappy(1)); // true;
    }
}
