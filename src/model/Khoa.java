/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Khoa {
    private String makhoa;
    private String tenkhoa;
    private String ngaythanhlap;    

    public Khoa() {
    }

    public Khoa(String makhoa, String tenkhoa, String ngaythanhlap) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.ngaythanhlap = ngaythanhlap;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getNgaythanhlap() {
        return ngaythanhlap;
    }

    public void setNgaythanhlap(String ngaythanhlap) {
        this.ngaythanhlap = ngaythanhlap;
    }
    
}
