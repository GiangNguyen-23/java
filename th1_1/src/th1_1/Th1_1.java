
import java.util.Scanner;

/**
 *
 * @author Giang Nguyễn
 */
public class Th1_1 {

    public static void main(String[] args) {
        // TODO code application logic here4
        int a[] = nhapmang();
        System.out.print("Mảng đã nhập là: ");
        hienThi(a);
        snt(a);
        GTLN(a);
        sapxeptangdan(a);
        System.out.print("Mảng sau khi sắp xếp theo thứ tự tăng dần là: ");
        hienThi(a);
        sapxepgiamdan(a);
        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần là: ");
        hienThi(a);
    }

    public static boolean checksnt(int number) {
        if (number <= 1) {
            return false;
        }

        // Kiểm tra xem số có ước nào khác 1 và chính nó không
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void snt(int[] a) {
        System.out.print("Các phần tử là số nguyên tố trong mảng là: ");
        for (int num : a) {
            if (checksnt(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static int[] nhapmang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        if (n >= 100 || n <= 0) {
            System.out.println("Nhập n sai");
            return null;
        }
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void hienThi(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int GTLN(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là " + max);
        return max;
    }

    public static void sapxeptangdan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void sapxepgiamdan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

}
