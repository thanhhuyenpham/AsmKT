package com.example.AsmKT;

public class TinhTrungBinhCong {
    public static double TinhTrungBinhCong(double[] numbers) {
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        } else {
            double sum = 0;
            for (double number: numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }
    }
}
