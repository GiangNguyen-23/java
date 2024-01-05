/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

/**
 *
 * @author Hoang
 */
public abstract class NhanVien {
    private String ma;
    private String hoten;
    private float luong;
    private String gioitinh;
    public NhanVien() {
    }

    public NhanVien(String ma, String hoten, String gioitinh, float luong) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioiting) {
        this.gioitinh = gioiting;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    abstract float tinhLuongThuong();
    
}
