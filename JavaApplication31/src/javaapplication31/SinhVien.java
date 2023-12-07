/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication31;

/**
 *
 * @author Giang Nguyễn
 */
public class SinhVien {
    private String masv;
    private String ten;
    private float diem;
    private String xeploai;
    public SinhVien(String masv, String ten, float diem, String xeploai) {
        this.masv = masv;
        this.ten = ten;
        this.diem = diem;
        this.xeploai = xeploai();
    }

    SinhVien(String masv, String ten, float diem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getmasv()
    {
        return masv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getten()
    {
        return ten;
    }

    public void setDiem(float diem) {
        this.diem = diem;
        this.xeploai= xeploai();
    }
    public float getDiem() {
        return diem;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
    public String getXeploai() {
        return xeploai;
    }
    private String xeploai()
    {
        if(diem>8) return "Gioi";
        else if(diem>=7) return "kha";
        else if(diem>=5) return "TB";
        else return "kem";
    }
    @Override
    public String toString() {
        return "Mã sinh viên: " + masv + "\nHọ tên: " + ten + "\nĐiểm: " + diem + "\nXếp loại: " + xeploai;
    }
   
}
