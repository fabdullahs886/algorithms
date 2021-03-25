package com.problems.easy;

public class SecondLargestDigitInString {
    private int secondHighest(String s) {
        int largest = -1, slargest = -1;
        for( char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int num = Integer.parseInt(c + "");
                if(num > largest){
                    slargest = largest;
                    largest = num;
                }else if(num > slargest && num < largest){
                    slargest = num;
                }
            }
        }
        return slargest;
    }

    public static void main(String[] args){
        SecondLargestDigitInString obj = new SecondLargestDigitInString();
        System.out.println(obj.secondHighest("dfa12321afd")); // 2
        System.out.println(obj.secondHighest("abc1111")); // -1

    }
}
