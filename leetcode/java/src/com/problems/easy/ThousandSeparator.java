package com.problems.easy;

public class ThousandSeparator {
    private String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length();
        while(i > 3){
            sb.insert(i-3,".");
            i -= 3;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        ThousandSeparator obj = new ThousandSeparator();
        System.out.println(obj.thousandSeparator(987)); // 987
        System.out.println(obj.thousandSeparator(1234)); // 1.234
        System.out.println(obj.thousandSeparator(123456789)); // 123.456.789
        System.out.println(obj.thousandSeparator(0)); // 0
    }
}
