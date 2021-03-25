package com.problems.easy;

public class DetermineIfStringHalvesAreAlike {
    private boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        String s1 = s.substring(0,len);
        String s2 = s.substring(len);
        int count1 = 0, count2 = 0;

        for(int i = 0; i < len; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == 'a' || c1 == 'A' || c1 == 'e' || c1 == 'E' || c1 == 'i' ||c1 == 'I' || c1 == 'o' || c1 == 'O' || c1 =='u' || c1 == 'U')
                count1++;
            if(c2 == 'a' || c2 == 'A' || c2 == 'e' || c2 == 'E' || c2 == 'i' ||c2 == 'I' || c2 == 'o' || c2 == 'O' || c2 =='u' || c2 == 'U')
                count2++;
        }

        return count1 == count2;
    }

    public static void main(String[] args){
        DetermineIfStringHalvesAreAlike obj = new DetermineIfStringHalvesAreAlike();
        System.out.println(obj.halvesAreAlike("book")); // true
        System.out.println(obj.halvesAreAlike("textbook")); // false
        System.out.println(obj.halvesAreAlike("MerryChristmas")); // false
        System.out.println(obj.halvesAreAlike("AbCdEfGh")); // true
    }
}
