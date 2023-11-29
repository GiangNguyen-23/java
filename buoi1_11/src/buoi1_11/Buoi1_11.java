import java.util.Scanner;
public class Buoi1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int a[] = nhapMang();  
        System.out.println("Mảng đã nhập là: ");
        hienThi(a);
        GTLN(a);
        sapxep(a);
        System.out.print("Mảng sau khi sắp xếp là: ");
        hienThi(a);
    }
    //a
    public static int[] nhapMang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        
        if(n>=100 || n<=0)
        {
            System.out.println("Nhập n sai");
            return null;
        }
        int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("a["+(i+1)+"]: ");
                a[i] = sc.nextInt();
            }
        return a;
    }
    //b
    public static void hienThi(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    //c
    public static int GTLN(int a[])
    {
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là "+max);
        System.out.print("vị trí của "+ max +" trong mảng là: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
            {
                System.out.print(i+1);
            }
        }
        System.out.println();
        return max;
    } 
    //d
    public static void sapxep(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<a.length-1;j++)
           {
               if(a[j] > a[j+1])
               {
                   int t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;
               }
           }
        }
        
    }
    
}
