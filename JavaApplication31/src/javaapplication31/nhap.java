/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication31;
import java.util.Scanner;
/**
 *
 * @author Giang Nguyễn
 */
public class nhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String masv = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String ten = scanner.nextLine();
        float diem = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập điểm: ");
                diem = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập dữ liệu là kiểu số. Vui lòng nhập lại.");
            }
        }
        SinhVien sinhVien = new SinhVien(masv, ten, diem);
        System.out.println("\nThông tin sinh viên:");
        System.out.println(sinhVien.toString());
    }
}
