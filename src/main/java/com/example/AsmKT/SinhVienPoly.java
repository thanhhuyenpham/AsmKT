package com.example.AsmKT;

import java.util.ArrayList;
import java.util.List;

public class SinhVienPoly {
    List<SinhVien> listSinhVien;
    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }
    public SinhVienPoly() {
        listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("ID01", "Huyền", "ML123", "Java", "PH123"));
        listSinhVien.add(new SinhVien("ID02", "Tâm", "ML123", "Java", "PH456"));
    }
    public void add(String id, String hoTen, String maLop, String tenLop, String maSV) {
        if (id.length() < 3 || id.length() > 10) {
            System.out.println("ID không thỏa mãn ký tự!");
            return;
        }
        if (hoTen.length() < 3 || hoTen.length() > 10) {
            System.out.println("Họ tên không thỏa mãn ký tự!");
            return;
        }
        if (maLop.length() < 3 || maLop.length() > 10) {
            System.out.println("Mã lớp không thỏa mãn ký tự!");
            return;
        }
        if (tenLop.length() < 3 || tenLop.length() > 10) {
            System.out.println("Tên lớp không thỏa mãn ký tự!");
            return;
        }
        for (char a : tenLop.toCharArray()) {
            if (!Character.isLetterOrDigit(a) && !Character.isWhitespace(a)) {
                System.out.println("Tên lớp chứa ký tự đặc biệt!");
                return;
            }
        }
        if (maSV.length() < 3 || maSV.length() > 10) {
            System.out.println("Mã sinh viên không thỏa mãn ký tự!");
            return;
        }
        listSinhVien.add(new SinhVien(id, hoTen, maLop, tenLop, maSV));
    }
    public boolean searchMaSV(String maSV) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getMasv().equalsIgnoreCase(maSV)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchHoten(String hoten) {
        for (SinhVien sinhVien : listSinhVien
        ) {
            if (sinhVien.getHoten().equalsIgnoreCase(hoten)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchMalop(String malop) {
        for (SinhVien sinhVien : listSinhVien
        ) {
            if (sinhVien.getMalop().equalsIgnoreCase(malop)) {
                return true;
            }
        }
        return false;
    }
}
