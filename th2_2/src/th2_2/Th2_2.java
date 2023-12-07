import java.util.Scanner;

public class Th2_2 {

    public static class Student {
        protected String code;
        protected String name;
        protected String birthplace;
        protected String point;


        public Student() {
        }

        public Student(String code, String name, String birthplace, String point) {
            this.code = code;
            this.name = name;
            this.birthplace = birthplace;
            this.point = point;
        }
    }

    public static class Test {
        protected int n;
        protected int k;
        protected Student[] lstStudent;
        protected Scanner s;

        public Test(int n, int k, Student[] lstStudent, Scanner s) {
            this.n = n;
            this.k = k;
            this.lstStudent = lstStudent;
            this.s = s;
        }

        public Test() {
            s = new Scanner(System.in);
            n = 100;
            lstStudent = new Student[n];
            k = 0;
        }

        public void insertStudent() {
            if (k >= n) {
                System.out.println("Danh sách học viên đã đầy.");
                return;
            }
            Student std = new Student();
            System.out.println("Nhập thông tin học viên:");

            System.out.print("Mã học viên: ");
            std.code = s.nextLine();

            System.out.print("Họ tên: ");
            std.name = s.nextLine();

            System.out.print("Quê quán: ");
            std.birthplace = s.nextLine();

            System.out.print("Điểm thi: ");
            std.point = s.nextLine();
            lstStudent[k] = std; 
            k++;
        }

        public void DisplayStudents() {
            if (k == 0) {
                System.out.println("Danh sách học viên rỗng.");
                return;
            }
            System.out.println("Danh sách học viên:");
            for (int i = 0; i < k; i++) {
                Student student = lstStudent[i];
                System.out.println("Mã học viên: " + student.code);
                System.out.println("Họ tên: " + student.name);
                System.out.println("Quê quán: " + student.birthplace);
                System.out.println("Điểm thi: " + student.point);
                System.out.println("---------------------------");
            }
        }

        public void SearchStudent() {
            System.out.print("Nhập tên học viên cần tìm kiếm: ");
            String searchName = s.nextLine();

            boolean found = false;

            for (int i = 0; i < k; i++) {
                Student student = lstStudent[i];
                if (student.name.equalsIgnoreCase(searchName)) {
                    System.out.println("Thông tin học viên:");
                    System.out.println("Mã học viên: " + student.code);
                    System.out.println("Họ tên: " + student.name);
                    System.out.println("Quê quán: " + student.birthplace);
                    System.out.println("Điểm thi: " + student.point);
                    System.out.println("---------------------------");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy học viên có tên '" + searchName + "'.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Test test = new Test();
        String luachon;
        int i=0;
        do {
            test.insertStudent();
            System.out.print("Tiếp tục nhập (y/n)? ");
            luachon = nhap.nextLine();
            
        } while (!luachon.equalsIgnoreCase("n"));
        test.DisplayStudents();
        
        test.SearchStudent();
    }
}
