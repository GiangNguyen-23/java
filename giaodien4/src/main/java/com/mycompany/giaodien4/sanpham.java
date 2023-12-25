/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodien4;

/**
 *
 * @author Giang Nguyễn
 */
public class sanpham {
    private String masp;
    private String sp;
    private int gia;
    private String Ma;

    public sanpham() {
    }

    public sanpham(String masp, String sp, int gia, String Ma) {
        this.masp = masp;
        this.sp = sp;
        this.gia = gia;
        this.Ma = Ma;
    }

    public String getMasp() {
        return masp;
    }

    public String getSp() {
        return sp;
    }

    public int getGia() {
        return gia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }
    
    
}
