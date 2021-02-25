package com.problems.easy;

import java.util.Random;

public class GuessNumberHigherOrLower {

    private int guessNumber(int n) {
        int low = 1, high = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            int res = guess(mid);
            if(res == 0){
                return mid;
            }else if( res < 0){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    private int guess(int n){
        int mynum = 6;
        
        if(mynum < n) return -1;

        if(mynum > n) return 1;
        return 0;
    }
    public static void main(String[] args){
        GuessNumberHigherOrLower obj = new GuessNumberHigherOrLower();
        System.out.println(obj.guessNumber(10));
    }
}
