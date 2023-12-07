import java.util.Scanner;
/**
 *
 * @author Giang Nguyễn
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String chuoi = sc.nextLine();   
        System.out.print("nhập ký tự: ");
        char kytu = sc.next().charAt(0);
        System.out.println(check(kytu, chuoi));
    }
    public static String check(char kytu, String chuoi)
    {
        return chuoi.indexOf(kytu) !=-1 ?"có":"không";
    }
    
}
