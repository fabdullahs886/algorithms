package com.problems.easy;

import javax.swing.text.Style;

public class DetectCapital {
    private boolean detectCapitalUse(String word) {
        int upperCount = 0, lowerCount = 0, firstUpper = 0;
        int len = word.length();
        int c = (int)'z';
//        System.out.println(c);

        for(int i = 0; i < len;i++){
            int letter = (int)word.charAt(i);
            if(letter >= 65 && letter <= 90) {
                if(i == 0)
                    firstUpper++;
                upperCount++;
            }
            if(letter >= 97 && letter <= 122)
                lowerCount++;
        }
        if( lowerCount  == len || upperCount == len )
            return true;

        if(firstUpper + lowerCount == len)
            return true;

        return false;
    }

    public  static void main(String[] args){
        DetectCapital obj = new DetectCapital();
        System.out.println(obj.detectCapitalUse("USA")); // true
        System.out.println(obj.detectCapitalUse("flaG")); // false
    }
}
