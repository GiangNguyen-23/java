import java.util.Scanner;
public class Buoi1_5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        double a = sc.nextInt();
        System.out.print("b= ");
        double b = sc.nextInt();  
        if(a!=0)
        {
            System.out.println("Nhiệm của PT "+a+"x + "+b+" =0 là: x = "+nghiem(a, b));
        }else
        {
            System.out.print("a phải khác 0");
        }
    }
    public static double nghiem(double a, double b)
    {
        return -b/a;
    }
    
}
