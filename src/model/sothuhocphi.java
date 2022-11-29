/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class sothuhocphi {

    private String stt;
    private String ky;
    private String namhoc;
    private String tungay;
    private String denngay;
    private String noidung;

    public sothuhocphi() {
    }

    public sothuhocphi(String stt, String ky, String namhoc, String tungay, String denngay, String noidung) {
        this.stt = stt;
        this.ky = ky;
        this.namhoc = namhoc;
        this.tungay = tungay;
        this.denngay = denngay;
        this.noidung = noidung;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getKy() {
        return ky;
    }

    public void setKy(String ky) {
        this.ky = ky;
    }

    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }

    public String getTungay() {
        return tungay;
    }

    public void setTungay(String tungay) {
        this.tungay = tungay;
    }

    public String getDenngay() {
        return denngay;
    }

    public void setDenngay(String denngay) {
        this.denngay = denngay;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

}
