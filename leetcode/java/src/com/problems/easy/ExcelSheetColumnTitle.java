package com.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
    private String convertToTitle(int n) {
        Map<Integer,String> map =new HashMap<Integer,String>();
        map.put(1,"A");map.put(2,"B");map.put(3,"C");map.put(4,"D");map.put(5,"E");
        map.put(6,"F");map.put(7,"G");map.put(8,"H");map.put(9,"I");map.put(10,"J");        map.put(11,"K");map.put(12,"L");map.put(13,"M");map.put(14,"N");map.put(15,"O");
        map.put(16,"P");map.put(17,"Q");map.put(18,"R");map.put(19,"S");map.put(20,"T");
        map.put(21,"U");map.put(22,"V");map.put(23,"W");map.put(24,"X");map.put(25,"Y");
        map.put(26,"Z");

        if(n <= 26)
            return map.get(n);

        String str = "";
        while(n > 26){
            int num = n%26;
            n /= 26;
            if(num == 0){
                num = 26;
                n--;
            }
            str = map.get(num) + str;

        }
        if(n != 0)
            str = map.get(n) + str;

        return str;
    }

    public static void main(String[] args){
        ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();
        System.out.println(obj.convertToTitle(27)); // AA
        System.out.println(obj.convertToTitle(52)); // AZ
        System.out.println(obj.convertToTitle(1)); // A
        System.out.println(obj.convertToTitle(28)); // AB
        System.out.println(obj.convertToTitle(701)); // ZY
    }
}
