package com.problems.easy;

// Category : Easy
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//        Example 1:
//
//        Input: 121
//        Output: true
//        Example 2:
//
//        Input: -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//        Follow up:
//
//        Could you solve it without converting the integer to a string?

public class PalindromeNumber {
    private boolean isPalindrome(int x) {
        boolean ans = false;
        ans = solution1(x);
        return ans;
    }

    private boolean solution1(int x){
        String str = String.valueOf(x);

        char[] c = str.toCharArray();
        int i = 0, j = c.length - 1;
        while(j > i){
            if ( c[i] != c[j])
                return false;
            i++;
            j--;

        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(121)); //ans: true
        System.out.println(obj.isPalindrome(-121)); //ans: false
        System.out.println(obj.isPalindrome(10)); //ans: false
    }
}
