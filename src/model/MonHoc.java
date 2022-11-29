/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class MonHoc {
    private String mamon;
    private String tenmon;
    private String sotin;
    private String sotien;

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getSotin() {
        return sotin;
    }

    public void setSotin(String sotin) {
        this.sotin = sotin;
    }

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }


    public MonHoc(){
        
    }
    
    public MonHoc(String mamon, String tenmon, String sotin, String sotien) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotin = sotin;
        this.sotien = sotien;
    }
    
}
