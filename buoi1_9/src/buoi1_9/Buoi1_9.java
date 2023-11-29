import java.util.Scanner;
import static java.lang.System.out;
/**
 *
 * @author Giang Nguyễn
 */
public class Buoi1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        out.print("n = ");
        int n = sc.nextInt();
        double s=0;
        if(n>0)
        {
        for(int i=1;i<=n;i++)
        {
            s+= Math.pow(-1,i+1)*(1.0/i);
        }
        out.println("tổng= "+(s+1));
        }else
            out.println("Nhập n không đúng");
    }
}
