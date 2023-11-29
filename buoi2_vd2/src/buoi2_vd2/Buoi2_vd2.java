import java.util.Scanner;
public class Buoi2_vd2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month = 2;
        int numdays = 0;
        switch (month) {
        case 2:
            numdays = 28;
            break; //phải có break sau mỗi case
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            numdays = 31;
            break;
        default: //phải có default
            numdays = 30;
        }
        System.out.println("num of day = " + numdays);
    }
    
}
