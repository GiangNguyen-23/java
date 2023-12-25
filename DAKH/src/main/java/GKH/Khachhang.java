/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Giang Nguyễn
 */
public class Khachhang extends Person {

    static Object getString(String gt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//thuộc tính

    private String Diachi;
    private String Sodu;
//ngầm định

    public Khachhang() {
        super(); // Gọi constructor ngầm định của lớp cha
        this.Diachi = "";
        this.Sodu = "";
    }
    //tường minh

    public Khachhang(String Diachi, String Sodu, String SoTK, String Hoten, String GT) {
        super(SoTK, Hoten, GT);//gọi lại ngầm định lớp cha
        this.Diachi = Diachi;
        this.Sodu = Sodu;
    }

    public Khachhang(String Diachi, String Sodu) {
        this.Diachi = Diachi;
        this.Sodu = Sodu;
    }
    
//get

    public String getDiachi() {
        return Diachi;
    }

    public String getSodu() {
        return Sodu;
    }
//set

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setSodu(String Sodu) {
        this.Sodu = Sodu;
    }

    @Override
    public void Khuyenmai() {
        if (getGT().equalsIgnoreCase("nu")) {
            System.out.println("Khuyến mại");
        } else {
            System.out.println("");
        }
    }

}
