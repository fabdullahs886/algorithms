package com.problems.easy;

//Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.
//
//        Notice that the row index starts from 0.
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//        Follow up:
//
//        Could you optimize your algorithm to use only O(k) extra space?
//
//
//
//        Example 1:
//
//        Input: rowIndex = 3
//        Output: [1,3,3,1]
//        Example 2:
//
//        Input: rowIndex = 0
//        Output: [1]
//        Example 3:
//
//        Input: rowIndex = 1
//        Output: [1,1]
//
//
//        Constraints:
//
//        0 <= rowIndex <= 40

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    private List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <= rowIndex;i++){
            result.add(0,1);
            for(int j = 1; j < result.size() - 1; j++){
                int a = result.get(j);
                int b = result.get(j+1);
                result.set(j, a + b);
            }
        }
        return result;
    }

    public static void main(String[] args){
        PascalsTriangleII obj = new PascalsTriangleII();
        System.out.println(obj.getRow(3)); // [1,3,3,1]
        System.out.println(obj.getRow(0)); // [1]
        System.out.println(obj.getRow(1)); // [1,1]


    }
}
