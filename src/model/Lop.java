/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Lop {
    private String malop;
    private String tenlop;
    private String gvcn;
    private String sosinhvien;
    private String makhoa;

    public Lop(String malop, String tenlop, String gvcn, String sosinhvien, String makhoa) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.gvcn = gvcn;
        this.sosinhvien = sosinhvien;
        this.makhoa = makhoa;
    }

    public Lop() {
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

    public String getGvcn() {
        return gvcn;
    }

    public void setGvcn(String gvcn) {
        this.gvcn = gvcn;
    }

    public String getSosinhvien() {
        return sosinhvien;
    }

    public void setSosinhvien(String sosinhvien) {
        this.sosinhvien = sosinhvien;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }
    
}
