package th2_1;
import java.util.Scanner;

public class Th2_1 {
    // lớp Shape
    public abstract static class Shape {
        protected String Mau;
        protected String FillMau;

        public Shape(String Mau, String FillMau) {
            this.Mau = Mau;
            this.FillMau = FillMau;
        }

        public void setMau(String mau) {
            this.Mau = mau;
        }
        public String getMau() {
            return Mau;
        }

        public void setFillMau(String fillmau) {
            this.FillMau = fillmau;
        }

        public String getFillMau() {
            return FillMau;
        }

        public abstract boolean KiemTra();

        public abstract double TinhDienTich();

        public abstract double TinhChuVi();
    }

    // lớp Triangle kế thừa từ lớp Shape
    public static class Triangle extends Shape {
        private double canh1;
        private double canh2;
        private double canh3;

        public Triangle(String mau, String fillmau, double canh1, double canh2, double canh3) {
            super(mau, fillmau);
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        }

        public void setCanh1(double canh1) {
            this.canh1 = canh1;
        }

        public double getCanh1() {
            return canh1;
        }

        public void setCanh2(double canh2) {
            this.canh2 = canh2;
        }

        public double getCanh2() {
            return canh2;
        }

        public void setCanh3(double canh3) {
            this.canh3 = canh3;
        }

        public double getCanh3() {
            return canh3;
        }

        @Override
        public boolean KiemTra() {
            return (canh1 + canh2 > canh3) && (canh2 + canh3 > canh1) && (canh3 + canh1 > canh2);
        }

        @Override
        public double TinhChuVi() {
            return (canh1 + canh2 + canh3);
        }

        @Override
        public double TinhDienTich() {
            double p = TinhChuVi() / 2;
            return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
        }
    }

    // lớp test
    public class test
    {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho tam giác
        System.out.println("Nhập độ dài các cạnh của tam giác:");
        System.out.print("Cạnh 1: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Cạnh 2: ");
        double canh2 = scanner.nextDouble();
        System.out.print("Cạnh 3: ");
        double canh3 = scanner.nextDouble();

        System.out.print("Nhập màu sắc: ");
        String mau = scanner.next();
        System.out.print("Nhập màu fill: ");
        String fillMau = scanner.next();

        Triangle triangle = new Triangle(mau, fillMau, canh1, canh2, canh3);
        if (triangle.KiemTra()) {
            System.out.println("Chu vi của tam giác là: " + triangle.TinhChuVi());
            System.out.println("Diện tích của tam giác là: " + triangle.TinhDienTich());
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác!");
        }
        scanner.close();
        }
    }
    
    public static void main(String[] args) {
        test.main(args);
    }
}
