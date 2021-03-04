package com.problems.easy;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    private double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        int count = 0;
        for(int i = 1; i < salary.length - 1; i++){
            sum += salary[i];
        }
        double avg = sum/(salary.length - 2);
        System.out.println("sum: " + sum + " len : " + (salary.length - 2));
        return avg;
    }

    public static void main(String[] args){
        AverageSalaryExcludingTheMinimumAndMaximumSalary obj = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        System.out.println(obj.average(new int[]{4000,3000,1000,2000})); // 2500.00000
        System.out.println(obj.average(new int[]{1000,2000,3000})); // 2000.00000
        System.out.println(obj.average(new int[]{6000,5000,4000,3000,2000,1000})); // 3500.00000
        System.out.println(obj.average(new int[]{8000,9000,2000,3000,6000,1000})); // 4750.00000
        System.out.println(obj.average(new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000})); // 41111.11111
    }
}
