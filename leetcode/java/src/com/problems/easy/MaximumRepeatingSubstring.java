package com.problems.easy;

public class MaximumRepeatingSubstring {
    private int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while(true){
            int index = sequence.indexOf(sb.toString());
            if(index == -1)
                break;
            else{
                count++;
                sb.append(word);
            }
        }
        return count;
    }

    public static void main(String[] args){
        MaximumRepeatingSubstring obj = new MaximumRepeatingSubstring();
        System.out.println(obj.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba")); // 5
        System.out.println(obj.maxRepeating("ababc", "ab")); // 2
        System.out.println(obj.maxRepeating("ababc", "ba")); // 1
        System.out.println(obj.maxRepeating("ababc", "ac")); // 0
        System.out.println(obj.maxRepeating("a", "a")); // 1
    }
}
