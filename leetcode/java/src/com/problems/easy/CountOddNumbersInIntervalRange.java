package com.problems.easy;

public class CountOddNumbersInIntervalRange {
    private int countOdds(int low, int high) {
        int count = (high - low)/2;
        if( low%2 != 0 || high%2 != 0)
            count++;

        return count;
    }

    public static void main(String[] args) {
        CountOddNumbersInIntervalRange obj  = new CountOddNumbersInIntervalRange();
        System.out.println(obj.countOdds(327296043,769434803)); // 3
    }
}


