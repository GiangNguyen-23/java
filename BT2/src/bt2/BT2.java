/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author Giang Nguyễn
 */
public class BT2 {

    static class HinhChuNhat
    {
        //thuộc tính
        protected double dai;
        protected  double rong;
        //khởi tạo
        public HinhChuNhat(double dai,double rong)
        {
            this.dai =dai;
            this.rong = rong;
        }
        //hàm get
        public double getDai()
        {
            return dai;
        }
        public double getRong()
        {
            return rong;
        }
        //hàm set
        public void setDai(double d)
        {
            dai=d;
        }
        public void setRong(double r)
        {
            rong=r;
        }
        public double dientich()
        {
            return dai*rong;
        }
        public double chuvi()
        {
            return (dai+rong)*2;
        }
  
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Chiều dài: ");
        double chieuRong = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("Diện tích hình chữ nhật: " + hcn.dientich());
        System.out.println("Chu vi hình chữ nhật: " + hcn.chuvi());
        
        
    }
    
}
