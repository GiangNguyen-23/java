import java.util.Scanner;
public class Buoi2_vd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testScore = 76;
        char grade;
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
    
}
