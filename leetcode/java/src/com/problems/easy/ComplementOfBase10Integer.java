package com.problems.easy;

public class ComplementOfBase10Integer {
    private int bitwiseComplement(int N) {
        if (N == 0) return 1;
        String str = "";
        while(N > 0){
            str = N%2 + str;
            N = N/2;
        }
//        System.out.println(str);

        String str1 = "";
        for(int i = 0; i < str.length();i++){
            int num = Integer.parseInt("" + str.charAt(i));
            if(num == 1)
                num = 0;
            else
                num = 1;
            str1 += num ;
        }
//        System.out.println(str1);

        int num = 0;
        for(int i = 0; i < str1.length(); i++){
            int j = Integer.parseInt("" + str1.charAt(str1.length() - 1 - i));
            int num1 = (int)Math.pow(2,i);
            num += num1*j;
        }
        return num;
    }

    public static void main(String[] args) {
        ComplementOfBase10Integer obj = new ComplementOfBase10Integer();

        System.out.println(obj.bitwiseComplement(5)); //  2
        System.out.println(obj.bitwiseComplement(7)); //  0
        System.out.println(obj.bitwiseComplement(10)); //  5
    }

}
