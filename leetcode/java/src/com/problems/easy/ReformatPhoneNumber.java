package com.problems.easy;

public class ReformatPhoneNumber {
    private String reformatNumber(String number) {
        number = number.replaceAll(" ","").replaceAll("-","");

        int len = number.length();
        int i = 0;

        StringBuilder sb = new StringBuilder(number);
        while(len > 4){
            i += 3;
            sb.insert(i,"-");
            len -= 3;
            i++;
        }
        if(len == 4){
            sb.insert(i+2,"-");
        }

        return sb.toString();
    }

    public static void main(String[] arsg){
        ReformatPhoneNumber obj = new ReformatPhoneNumber();
        System.out.println(obj.reformatNumber("1-23-45 6")); // "123-456"
        System.out.println(obj.reformatNumber("123 4-567")); // "123-45-67"
        System.out.println(obj.reformatNumber("123 4-5678")); // "123-456-78"
        System.out.println(obj.reformatNumber("12")); // "12"
        System.out.println(obj.reformatNumber("123")); // "123"
        System.out.println(obj.reformatNumber("--17-5 229 35-39475 ")); // "175-229-353-94-75"
    }
}
