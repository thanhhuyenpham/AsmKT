package com.example.AsmKT;

public class TinhTong2SoNguyen {
    public int TinhTong2SoNguyen(String a, String b) {
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
        } catch (Exception e) {
            throw new NumberFormatException("Bạn phải nhập vào số nguyên");
        }
        return Integer.parseInt(a) +
                Integer.parseInt(b);
    }
}
