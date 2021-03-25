package com.problems.easy;

public class MaximumNestingDepthOfParentheses {
    private int maxDepth(String s) {
        int depth = 0, count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
                if(count > depth)
                    depth = count;
            }else if(c == ')'){
                count--;
            }
        }
        return depth;
    }

    public static void main(String[] args){
        MaximumNestingDepthOfParentheses obj = new MaximumNestingDepthOfParentheses();
        System.out.println(obj.maxDepth("(1+(2*3)+((8)/4))+1")); // 3
        System.out.println(obj.maxDepth("(1)+((2))+(((3)))")); // 3
        System.out.println(obj.maxDepth("1+(2*3)/(2-1)")); // 1
        System.out.println(obj.maxDepth("1")); // 0
    }
}
