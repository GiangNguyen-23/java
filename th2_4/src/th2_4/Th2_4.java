/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th2_4;

import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author Giang Nguyễn
 */
public class Th2_4 {

    abstract class GiangVien {

        private String ma;
        private String hoTen;
        private String diaChi;

        public GiangVien() {
        }

        public GiangVien(String ma, String hoTen, String diaChi) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.diaChi = diaChi;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public abstract void Nhap();

        public abstract void HienThi();
    }

    class CanBo extends GiangVien {

        private String chucvu;
        private double heso;
        Scanner scanner = new Scanner(System.in);

        public CanBo() {
            super();
        }

        public CanBo(String ma, String hoTen, String diaChi, String chucvu, double heso) {
            super(ma, hoTen, diaChi);
            this.chucvu = chucvu;
            this.heso = heso;
        }

        public String getChucvu() {
            return chucvu;
        }

        public void setChucvu(String chucvu) {
            this.chucvu = chucvu;
        }

        public double getHeso() {
            return heso;
        }

        public void setHeso(double heso) {
            this.heso = heso;
        }

        @Override
        public void Nhap() {
            System.out.print("Nhap ma giang vien: ");
            setMa(scanner.nextLine());

            System.out.print("Nhap ho ten giang vien: ");
            setHoTen(scanner.nextLine());

            System.out.print("Nhap dia chi giang vien: ");
            setDiaChi(scanner.nextLine());

            System.out.print("Nhap chuc vu: ");
            setChucvu(scanner.nextLine());

            System.out.print("Nhap he so: ");
            setHeso(scanner.nextDouble());
            scanner.nextLine();
        }

        @Override
        public void HienThi() {
            out.printf("Thong tin can bo  ");
            out.println();
            System.out.println("Ma giang vien: " + getMa());
            System.out.println("Ho ten giang vien: " + getHoTen());
            System.out.println("Dia chi giang vien: " + getDiaChi());
            System.out.println("Chuc vu: " + getChucvu());
            System.out.println("He so: " + getHeso());
        }

        public boolean Search(String ten) {
            return this.getHoTen().equals(ten) ? true : false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Th2_4 bai4 = new Th2_4();
        String luachon;

        CanBo[] danhSachCanBo = new CanBo[100];
        int i = 0, dem = 0;
        do {
            System.out.println("Nhap thong tin can bo thu " + (i + 1) + ":");
            CanBo canbo = bai4.new CanBo();
            canbo.Nhap();
            danhSachCanBo[i] = canbo;
            out.print("nhap vao lua chon cua ban (nhap n de ket thuc )");
            luachon = scanner.nextLine();

            i++;
            dem++;
        } while (!luachon.equals("n"));
        System.out.println("Danh sach cac can bo da nhap:");
        for (int j = 0; j < dem; j++) {
            danhSachCanBo[j].HienThi();
        }
        out.print("Nhap ten ban muon tim ");
        String ten = scanner.nextLine();
        boolean check = false;
        for (int j = 0; j < dem; j++) {
            if (danhSachCanBo[j].Search(ten)) {
                danhSachCanBo[j].HienThi();
                check = true;
            }
        }
        if (!check) {
            out.print("ten muon tim khong ton tai ");
        }
    }

}
