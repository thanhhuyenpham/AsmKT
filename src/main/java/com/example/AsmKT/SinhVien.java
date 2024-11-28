package com.example.AsmKT;

public class SinhVien {
    String id;
    String hoten;
    String malop;
    String tenlop;
    String masv;

    public SinhVien(String id, String hoten, String malop, String tenlop, String masv) {
        this.id = id;
        this.hoten = hoten;
        this.malop = malop;
        this.tenlop = tenlop;
        this.masv = masv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}
