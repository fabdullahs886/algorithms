package com.problems.easy;

public class UglyNumber {
    private boolean isUgly(int num) {
        if(num == 1) return true;

        while(num > 1){
            boolean flag = false;
            if(num > 1 && num%2 == 0) {
                num /= 2;
                flag = true;
            }
            if(num > 1 && num%3 == 0) {
                num /= 3;
                flag = true;
            }
            if(num > 1 && num%5 == 0) {
                num /= 5;
                flag = true;
            }
            if( num == 1)
                return true;
            if(!flag)
                break;
        }
        return false;
    }

    public static void main(String[] args){
        UglyNumber obj = new UglyNumber();
        System.out.println(obj.isUgly(6)); //true
        System.out.println(obj.isUgly(8)); //true
        System.out.println(obj.isUgly(14)); //false
    }
}
