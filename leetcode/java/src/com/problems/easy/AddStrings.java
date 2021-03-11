package com.problems.easy;

public class AddStrings {
    private String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int l1 = num1.length();
        int l2 = num2.length();
        int len = Math.max(l1,l2);
        int carry = 0;
        for(int i = 0; i < len - 1;i++){
            if(l1 != len) {
                num1 = "0" + num1;
                l1 = num1.length();
            }
            if(l2 != len) {
                num2 = "0" + num2;
                l2 = num2.length();
            }
        }
        System.out.println(num1 + " : " + num2);

        for(int i = len -1 ; i >= 0; i--){
            int a = Integer.parseInt(num1.charAt(i) + "");
            int b = Integer.parseInt(num2.charAt(i) + "");
            int sum = a + b + carry;
            if(sum > 9){
                res.insert(0,sum%10);
                carry = sum/10;
            }else{
                carry = 0;
                res.insert(0,sum);
            }
        }
        if(carry >0)
            res.insert(0,carry);

        System.out.println("num1: " + num1 + " , num2: " + num2 + ", sum: " + res.toString());

        return res.toString();
    }

    public static void main(String[] args){
        AddStrings obj = new AddStrings();
        System.out.println(obj.addStrings("12","1300"));
        System.out.println(obj.addStrings("12239029342","13003829230923"));
        System.out.println(obj.addStrings("1","9"));
    }
}
