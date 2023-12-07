/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th2_6;
import java.util.Scanner;

/**
 *
 * @author Giang Nguyễn
 */
public class Th2_6 {

    /**
     * @param args the command line arguments
     */
    public class NhanVien
    {
        protected String maNV;
        protected String hoten;
        protected String que;
        protected String Hesoluong;
        //maMV
        public void setmaNV(String maNV)
        {
            this.maNV = maNV;
        }
        public String getmaNV()
        {
            return maNV;
        }
        //hoten
        public void sethoten(String hoten)
        {
            this.hoten = hoten;
        }
        public String gethoten()
        {
            return hoten;
        }
        //que
        public void setque(String que)
        {
            this.que = que;
        }
        public String getque()
        {
            return que;
        }
        //Hesoluong
        public void setHesoluong(String Hesoluong)
        {
            this.Hesoluong = Hesoluong;
        }
        public String getHesoluong()
        {
            return Hesoluong;
        }
        //constructor
        public NhanVien(String maNV, String hoten,String que,String Hesoluong)
        {
            this.maNV = maNV;
            this.hoten =hoten;
            this.que = que;
            this.Hesoluong = Hesoluong;
        }
    }
    public class DLNhanVien
    {
        protected int n;
        protected int k;
        protected NhanVien[] dsnv;
        protected Scanner s;
        public DLNhanVien() {
            s = new Scanner(System.in);
            n = 100;
            dsnv = new NhanVien[n];
            k = 0;
        }
        public void NhapNhanVien()
        {
            if (k >= n) {
                System.out.println("Danh sách nhân viên vi đã đầy.");
                return;
            }
            System.out.println("Nhập mã nhân viên:");
            String maNV = s.nextLine();
            
            System.out.println("Nhập họ tên:");
            String hoten = s.nextLine();
            
            System.out.println("Nhập quê:");
            String que = s.nextLine();
            
            System.out.println("Nhập hệ số lương:");
            String HeSoluong = s.nextLine(); 
            NhanVien nv = new NhanVien(maNV, hoten, que, HeSoluong);
            dsnv[k] = nv;
            k++;
        System.out.println("Nhân viên đã được thêm vào danh sách.");
        }
        
        public void HienThiNhanVien()
        {
            if (k == 0) {
            System.out.println("Danh sách nhân viên rỗng.");
                return;
            }
            System.out.println("Danh sách học viên:");
            for (int i = 0; i < k; i++) {
            NhanVien student = dsnv[i];
            System.out.println("Mã nhân viên: " + student.getmaNV());
            System.out.println("Họ tên: " + student.gethoten());
            System.out.println("Quê quán: " + student.getque());
            System.out.println("hệ số lương: " + student.getHesoluong());
            System.out.println("---------------------------");
            }
        
        }
        public void TimKiemNhanVien()
        {
            if (k == 0) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
            }
            System.out.print("Nhập tên nhân viên cần tìm kiếm: ");
            String searchName = s.nextLine();
            
            boolean found = false;
            
             for (int i = 0; i < k; i++) {
            NhanVien student = dsnv[i];
            if (student.gethoten().equalsIgnoreCase(searchName)) {
                System.out.println("Thông tin nhân viên:");
                System.out.println("Mã nhân viên: " + student.getmaNV());
                System.out.println("Họ tên: " + student.gethoten());
                System.out.println("Quê quán: " + student.getque());
                System.out.println("hệ số lương: " + student.getHesoluong());
                System.out.println("---------------------------");
                found = true;
                break;
            }
            if (!found) {
            System.out.println("Không tìm thấy nhân viên có tên '" + searchName + "'.");
            }
            }
        }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
