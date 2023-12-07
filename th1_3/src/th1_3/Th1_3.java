import java.util.Scanner;

public class Th1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoiNhap = scanner.nextLine();
        if (kiemTraChuoi(chuoiNhap)) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
        scanner.close();
    }
    public static boolean kiemTraChuoi(String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}