package com.problems.easy;

public class DayOfTheYear {
    private int dayOfYear(String date) {
        int[] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(6,7));
        int day = Integer.parseInt(date.substring(9,10));

        for(int i = 0; i < month; i++){
            total += months[i];
            if(i == 1){
                if(year%100 == 0 && year%400 == 0)
                    total += 1;
            }
        }
        return total;
    }
}
