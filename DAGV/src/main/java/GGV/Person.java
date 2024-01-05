/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

/**
 *
 * @author Giang Nguyễn
 */
abstract public class Person {

    private String ma;
    private String hoten;
    private String gt;

    public Person() {
    }

    public Person(String ma, String hoten, String gt) {
        this.ma = ma;
        this.hoten = hoten;
        this.gt = gt;
    }

    public String getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGt() {
        return gt;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public abstract String Xetthuong();
        
}
