package com.problems.easy;

public class LatestTimeByReplacingHiddenDigits {
    private String maximumTime(String time) {
        String hr = time.split(":")[0];
        String min = time.split(":")[1];

        if(hr.equals("??"))
            hr = "23";
        if(min.equals("??"))
            min = "59";

        String prevS = "";
        for(int i = 0; i < 24; i++){
            String s = hr.replaceAll("\\?", i+"" );
            if(Integer.parseInt(s) > 23 || s.length() > 2){
                break;
            }else{
                prevS = s;
            }
        }


        String prevM = "";
        for(int i = 0; i < 59; i++){
            String s = min.replaceAll("\\?",i+"");
            if(Integer.parseInt(s) > 59 || s.length() > 2){
                break;
            }else{
                prevM = s;
            }
        }

        return prevS +":" + prevM;
    }

    public static void main(String[]  args){
        LatestTimeByReplacingHiddenDigits obj = new LatestTimeByReplacingHiddenDigits();
        System.out.println(obj.maximumTime("00:??")); // "00:59"
        System.out.println(obj.maximumTime("2?:?0")); // "23:50"
        System.out.println(obj.maximumTime("0?:3?")); // "09:39"
        System.out.println(obj.maximumTime("1?:22")); // "19:22"
    }
}
