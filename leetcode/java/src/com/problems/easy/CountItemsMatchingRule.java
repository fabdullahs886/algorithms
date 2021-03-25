package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    private int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List list: items){
            if(ruleKey.equals("type")){
                if(ruleValue.equals(list.get(0)))
                    count++;
            }else if(ruleKey.equals("color")){
                if(ruleValue.equals(list.get(1)))
                    count++;
            }else{
                if(ruleValue.equals(list.get(2)))
                    count++;
            }
        }


        return count;
    }

    public static void main(String[] args){
        CountItemsMatchingRule obj = new CountItemsMatchingRule();
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> items1 = new ArrayList<>();
        items1.add("phone");
        items1.add("blue");
        items1.add("pixel");
        list.add(items1);
        List<String> items2 = new ArrayList<>();
        items2.add("computer");
        items2.add("silver");
        items2.add("lenovo");
        list.add(items2);
        List<String> items3 = new ArrayList<>();
        items3.add("phone");
        items3.add("gold");
        items3.add("iphone");
        list.add(items3);


        System.out.println(obj.countMatches(list, "color","silver"));

    }
}
