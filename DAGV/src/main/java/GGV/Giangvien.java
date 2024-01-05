/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

/**
 *
 * @author Giang Nguyễn
 */
public class Giangvien extends Person {

    private String donvi;
    private int soct;
//get

    

    public String getDonvi() {
        return donvi;
    }

    public int getSoct() {
        return soct;
    }
//set

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setSoct(int soct) {
        this.soct = soct;
    }
//tưởng minh

    public Giangvien(String donvi, int soct, String ma, String hoten, String gt) {
        super(ma, hoten, gt);
        this.donvi = donvi;
        this.soct = soct;
    }

    

    
//ngầm định

    public Giangvien() {
    }

    @Override
    public String Xetthuong() {
        return this.soct >= 10 ? "Khen thưởng" : "";
    }
}
