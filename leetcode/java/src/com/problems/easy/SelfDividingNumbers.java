package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {
    private List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList();

        for(int i = left; i <= right; i++){
            int num = i;
            boolean flag = true;
            while(num > 0 ){
                int digit = num%10;
                if(digit == 0){
                    flag = false;
                    break;
                }
                num = num/10;
                if(i%digit != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        SelfDividingNumbers obj = new SelfDividingNumbers();
        System.out.println(obj.selfDividingNumbers(1,22));
    }

}
