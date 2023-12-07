/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Giang Nguyễn
 */
public class JavaApplication31 {

    private static String xeploai;

    /**
     * @param args the command line arguments
     */
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
        SinhVien sinhVien = new SinhVien(masv, ten, diem, xeploai);
        System.out.println("\nThông tin sinh viên:");
        System.out.println(sinhVien.toString());
    }

}
