/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author Giang Nguyễn
 */
public class Nhanvien extends Person{
    private String diachi;
    private String luong;

    public String getDiachi() {
        return diachi;
    }

    public String getLuong() {
        return luong;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public Nhanvien() {
    }

    public Nhanvien(String diachi, String luong) {
        this.diachi = diachi;
        this.luong = luong;
    }

    public Nhanvien(String diachi, String luong, String manv, String hoten) {
        super(manv, hoten);
        this.diachi = diachi;
        this.luong = luong;
    }
    
            
}
