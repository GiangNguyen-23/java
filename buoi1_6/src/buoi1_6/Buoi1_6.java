import java.util.Scanner;
public class Buoi1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        
        System.out.print("b = ");
        double b = sc.nextDouble();
        
        System.out.print("c = ");
        double c = sc.nextDouble();
        double x1,x2;
        double denta = b*b-4*a*c;
        if(a!=0)
        {
            if(denta==0)
            {
                System.out.print("Nghiệm của PT là x1=x2= "+-b/(2*a));
                
            }
            if(denta<0)
            {
                System.out.println("PT vô nghiệm");
            }
            if(denta>0)
            {
                System.out.println("Nghiệm của PT là:");
                System.out.println("x1= "+(-b+Math.sqrt(denta))/(2*a));
                System.out.println("x1= "+(-b-Math.sqrt(denta))/(2*a));
            }
        }else{
            System.out.println("a phải khác 0");
        }
        
    }
    
    
}
