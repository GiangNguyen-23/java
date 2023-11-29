import java.util.Scanner;
import static java.lang.System.out;
public class Buoi1_4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        out.print("a = ");
        int a = sc.nextInt();
        out.print("b = ");
        int b = sc.nextInt(); 
        if(b!=0){
//        out.println("ước là "+UCLN(a, b));
        PSTG(a, b);
        }else
        {
            out.println("Mẫu phải khác 0");
        }

        
    }
    public static int UCLN(int a, int b)
    {
        int max=a>b?a:b;
        int uoc=1;
       
        for(int i=1;i<=max;i++)
        {
            if(a%i==0 && b%i==0)
            {
                uoc=i;
            }
        }
        return uoc;
    }
    public static void PSTG(int a, int b)
    {
        int uoc = UCLN(a, b);
        int a1=a/uoc;
        int b1=b/uoc;
        out.println("Phân số tối giản: "+a1+"/"+b1);
    }
    
}
