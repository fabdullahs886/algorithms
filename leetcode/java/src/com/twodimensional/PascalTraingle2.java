package com.twodimensional;

//Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
//        Note that the row index starts from 0.
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//        Example:
//
//        Input: 3
//        Output: [1,3,3,1]
//        Follow up:
//
//        Could you optimize your algorithm to use only O(k) extra space?

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle2 {

    private List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>(rowIndex + 1);
//        result.add(1);

        for(int i = 0; i <= rowIndex; i++){
            int number = 1;
            for (int j =0; j <= i; j++){
                System.out.println(number);
                number = number * (i-j)/(j+1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTraingle2 sol = new PascalTraingle2();
//        System.out.println(sol.getRow(0)); // ans: [1]
        System.out.println(sol.getRow(1)); // ans: [1,1]
//        System.out.println(sol.getRow(2)); // ans: [1,2,1]
//        System.out.println(sol.getRow(3)); // ans: [1,3,3,1]
//        System.out.println(sol.getRow(4)); // ans : [1,4,6,4,1]
//        System.out.println(sol.getRow(5)); // ans : [1,5,10,10,5,1]

    }
}
