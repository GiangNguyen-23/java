/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Giang Nguyễn
 */
abstract class Person {
    //thuộc tính
    String SoTK;
    String Hoten;
    String GT;
//get
    public String getSoTK() {
        return SoTK;
    }

    public String getHoten() {
        return Hoten;
    }

    public String getGT() {
        return GT;
    }
//set
    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }
//tường minh
    public Person(String SoTK, String Hoten, String GT) {
        this.SoTK = SoTK;
        this.Hoten = Hoten;
        this.GT = GT;
    }
//ngầm định
    public Person() {
        this.SoTK = "";
        this.Hoten = "";
        this.GT = "";
    }
//phương thức ảo 
    public void Khuyenmai() {
        
    }
    

    
    
}
