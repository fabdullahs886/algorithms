package com.twodimensional;

//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it.

//Input: 5
//        Output:
//        [
//         [1],
//        [1,1],
//       [1, 2, 1],
//      [1, 3, 3, 1],
//     [1, 4, 6, 4, 1]
//        ]

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( numRows == 0) {
            return result;
        }

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        for(int i = 1; i < numRows;i++){
            List<Integer> prevList = result.get(i - 1);
            List<Integer> list = new ArrayList<Integer>();
            list.add(0,1);
            for (int j = 1; j < prevList.size();j++){
                list.add(prevList.get(j) + prevList.get(j - 1));
            }
            list.add(1);
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
//        System.out.println(sol.generate(1)); // ans: [[1]]
        System.out.println(sol.generate(2)); // ans: [[1],[1,1]]
//        System.out.println(sol.generate(3)); // ans: [[1],[1,1],[1,2,1]]
//        System.out.println(sol.generate(4)); // ans: [[1],[1,1],[1,2,1],[1,3,3,1]]
//        System.out.println(sol.generate(5)); // ans : [ [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1] ]
//        System.out.println(sol.generate(6)); // ans : [ [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1] ]
    }
}
