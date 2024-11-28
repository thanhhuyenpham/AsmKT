package com.example.AsmKT;

public class TruyXuat1PhanTu {
    public int TruyXuat1PhanTu(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid array or index");
        }
        return arr[index];
    }
}
