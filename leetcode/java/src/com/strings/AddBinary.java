package com.strings;

// Category : Easy
//Given two binary strings, return their sum (also a binary string).
//
//        The input strings are both non-empty and contains only characters 1 or 0.
//
//        Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"
//
//
//        Constraints:
//
//        Each string consists only of '0' or '1' characters.
//        1 <= a.length, b.length <= 10^4
//        Each string is either "0" or doesn't contain any leading zero.

public class AddBinary {

    private String addBinary(String a, String b) {
        String result = solution1(a,b);
        result = solution2(a,b);
        return result;
    }

    private String solution1(String a, String b){
        // Use as radix 2 because it's binary
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }

    private String solution2(String a, String b){
        int len1 = a.length();
        int len2 = b.length();
        if ( len1 != len2){
            int diff = Math.abs(len1 - len2);

            if ( len1 > len2){
                for(int i =0; i < diff;i++){
                    b = "0" + b;
                }
            }else{
                for(int i =0; i < diff;i++){
                    a = "0" + a;
                }
            }
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        String result = "";
        int bal = 0;
        for(int i = arr1.length - 1; i >= 0;i--){
            int num = Integer.parseInt(String.valueOf( arr1[i])) + Integer.parseInt(String.valueOf( arr2[i])) + bal;
            if(num == 3){
                bal = 1;
                result = "1" + result;
            }

            if ( num == 2){
                bal = 1;
                result = "0" + result;
            }

            if(num == 0 || num == 1){
                bal = 0;
                result = num + result;
            }
        }
        if (bal == 1)
            result = bal + result;

        return result;
    }

    public static void main(String[] args) {
        AddBinary sol = new AddBinary();

        System.out.println(sol.addBinary("1010","1011")); // ans : 10101
        System.out.println(sol.addBinary("1111","1111")); // ans : 11110
        System.out.println(sol.addBinary("11","1")); // ans : 100
        System.out.println(sol.addBinary("11","01")); // ans : 100


    }

}
