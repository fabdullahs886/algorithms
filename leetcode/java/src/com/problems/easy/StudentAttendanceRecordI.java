package com.problems.easy;

public class StudentAttendanceRecordI {
    private boolean checkRecord(String s) {
        int a = 0, l = 0;
        int count = 0;
        for(int i = 0; i < s.length();i++){
            char letter  = s.charAt(i);
            if(letter == 'A')
                a++;
            if(letter == 'L'){
                count++;
                if(count > 2)
                    return false;
                continue;
            }
            count = 0;

        }
        if(a < 2 && l < 2)
            return true;
        return false;
    }

    public static void main(String[] args){
        StudentAttendanceRecordI obj = new StudentAttendanceRecordI();
        System.out.println(obj.checkRecord("PPALLP")); // true
        System.out.println(obj.checkRecord("PPALLL")); // false
        System.out.println(obj.checkRecord("PPPPPPPP")); // true
        System.out.println(obj.checkRecord("AAPPPLLPLLL")); // false
        System.out.println(obj.checkRecord("LLPLLL")); // false
    }
}
