package com.strings;

//  Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
//  For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

// NOT WORKING. Runtime Exception

public class ReverseInteger {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
            if (pop > 7)
                return 0;
        }

        return rev;

        //////////////////////////////////////////////////////////

//        System.out.println("Input : " + x);
//        if (x > Integer.MAX_VALUE/10)
//            return 0;
//
//        boolean neg = false;
//        if (x < 10 && x > 0)
//            return x;
//
//        if (x < 0) {
//            x = Math.abs(x);
//            neg = true;
//        }
//
//        String str = String.valueOf(x);
//
//
//        char[] c = str.toCharArray();
//        int len = c.length / 2;
//        int rp = c.length - 1;
//        for (int i = 0; i < len; i++) {
//            char tmp = c[i];
//            c[i] = c[rp];
//            c[rp] = tmp;
//            rp--;
//        }
//
//        str = new String(c);
//        System.out.println("1 : " + str);
//        int output = Integer.parseInt(str);
//        if (neg)
//            output *= -1;
//
//
//        System.out.println("Output : " + output);
//        return output;
    }

    public static void main(String[] args){
        ReverseInteger sol  = new ReverseInteger();
        long ret = sol.reverse(123);
        System.out.println(ret);
//        ret = sol.reverse(-123);
//        System.out.println(ret);
//        ret = sol.reverse(120);
//        System.out.println(ret);
//        ret = sol.reverse(900000);
//        System.out.println(ret);
//        ret = sol.reverse(9646324351);
//        System.out.println(ret);

    }

}