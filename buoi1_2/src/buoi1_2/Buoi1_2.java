import java.util.Scanner;
public class Buoi1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        if(kiemTra(n))
        {
            long gt=giaithua(n);
            System.out.println("Giai thừa của "+n+ " là: "+gt);
            
        }else
        {
            System.out.println("n<0");
        }
        
    }
    public  static  boolean kiemTra(int n)
    {
       return n>0;
    }
    public static long giaithua(int n)
    {
        long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
    }
    
    
}
