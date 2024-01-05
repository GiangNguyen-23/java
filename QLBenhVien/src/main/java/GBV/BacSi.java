/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

/**
 *
 * @author Hoang
 */
public class BacSi extends NhanVien {

    private String khoa;

    public BacSi() {
    }

    public BacSi(String khoa, String ma, String hoten, String gioitinh, float luong) {
        super(ma, hoten, gioitinh, luong);
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public float tinhLuongThuong() {
        return (float) (getLuong() * 0.8);
    }

}
