package com.problems.easy;

public class ValidPerfectSquare {
    private boolean isPerfectSquare(int num) {
        return solution2(num);
    }

    private boolean solution2(int num){
        int start = 1, end  = num;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(1L*mid*mid == num )
                return true;
            else if(1L*mid*mid > num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }

    private boolean solution1(int num){
        int i = 0;
        while(i <= 65536){
            if(i*i == num)
                return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args){
        ValidPerfectSquare obj = new ValidPerfectSquare();
        System.out.println(obj.isPerfectSquare(16)); // true
        System.out.println(obj.isPerfectSquare(14)); // false
        System.out.println(obj.isPerfectSquare(2147483647)); // false
        System.out.println(obj.isPerfectSquare(808201)); // true
    }
}
