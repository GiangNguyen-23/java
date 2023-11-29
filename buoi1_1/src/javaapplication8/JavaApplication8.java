import java.util.Scanner;

public class JavaApplication8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 số nguyên dương a, b, c
        System.out.println("Nhập vào 3 số nguyên dương a, b, c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Kiểm tra xem có phải 3 cạnh của tam giác hay không
        if (kiemTra(a, b, c)) {
            double s = dienTich(a, b, c);
            double cv = chuVi(a, b, c);
            System.out.println("Đây là 3 cạnh của một tam giác.");
            System.out.println("Diện tích của tam giác là: " + s);
            System.out.println("Chu vi của tam giác là: " + cv);
        } else {
            System.out.println("Không phải 3 cạnh của một tam giác.");
        }

        scanner.close();
    }

    // Kiểm tra xem có phải 3 cạnh của tam giác hay không
    public static boolean kiemTra(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Tính diện tích của tam giác bằng công thức Heron
    public static double dienTich(int a, int b, int c) {
        double s = (a + b + c) / 2.0; // nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Tính chu vi của tam giác
    public static double chuVi(int a, int b, int c) {
        return a + b + c;
    }
}
