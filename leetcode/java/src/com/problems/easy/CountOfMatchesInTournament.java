package com.problems.easy;

public class CountOfMatchesInTournament {
    private int numberOfMatches(int n) {
        int sum = 0;
        while(n > 1){
            if(n%2 == 0){
                sum += n/2;
                n = n/2;
            }else{
                sum += (n-1)/2;
                n = (n-1)/2;
                n++;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        CountOfMatchesInTournament obj = new CountOfMatchesInTournament();
        System.out.println(obj.numberOfMatches(7)); // 6
        System.out.println(obj.numberOfMatches(14)); // 13
    }
}
