package com.problems.easy;

public class ReverseVowelsOfString {
    private String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int j = ch.length -1;
        for(int i = 0; i < ch.length;i++){
            char c = ch[i];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                while(j > i){
                    char cc = ch[j];
                    if(cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u' || cc == 'A' || cc == 'E' || cc == 'I' || cc == 'O' || cc == 'U'){
                        ch[i] = cc;
                        ch[j] = c;
                        j--;
                        break;
                    }
                    j--;
                }
            }
        }
        String ss  = new String(ch);

        return ss;


    }

    public static void main(String[] args){
        ReverseVowelsOfString obj = new ReverseVowelsOfString();
//        System.out.println(obj.reverseVowels("hello")); // holle
//        System.out.println(obj.reverseVowels("leetcode")); // leotcede
        System.out.println(obj.reverseVowels("aA")); // Aa
    }
}
