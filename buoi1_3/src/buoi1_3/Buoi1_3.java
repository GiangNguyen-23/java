import java.util.Scanner;

public class Buoi1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 2 số a và b: ");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("Nhập phép toán: ");
        char n = sc.next().charAt(0);
        
        double kq = 0;
        
        if(n=='+'|| n=='-' || n=='*' || n=='/')
        {
            if(n=='/' && b==0)
            {
                System.out.println("Lỗi!");
            }
            else
            {
                switch (n) {
                    case '+':
                        kq = a + b;
                        break;
                    case '-':
                        kq = a - b;
                        break;
                    case '*':
                        kq = a * b;
                        break;
                    case '/':
                        kq = a / b;
                        break;
                    }
                System.out.println("Kết quả của biểu thức " + a + " " + n + " " + b + " là: " + kq);
            }   
        }
        else
        {
            System.out.println("Lỗi!");
        }
    }
    
    
    
    
}
