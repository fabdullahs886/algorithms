package com.problems.easy;

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//        A defanged IP address replaces every period "." with "[.]".
//
//
//
//        Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
//
//
//        Constraints:
//
//        The given address is a valid IPv4 address.

public class DefangingAnIPAddress {
    private String defangIPaddr(String address) {
        solution1(address);
        return solution2(address);
    }

    private String solution1(String address){
        int len = address.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len; i++){
            char ch = address.charAt(i);
            if( ch == '.'){
                str.append("[" + ch + "]");
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }

    private String solution2(String address){
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        DefangingAnIPAddress obj = new DefangingAnIPAddress();

        System.out.println(obj.defangIPaddr("1.1.1.1"));    //  "1[.]1[.]1[.]1"

        System.out.println(obj.defangIPaddr("255.100.50.0"));    //  "255[.]100[.]50[.]0"


    }
}
