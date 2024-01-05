package GSV;

/**
 *
 * @author Giang Nguyễn
 */
public class Nguoi {
    private String Ma;
    private String Ten;
    private String GT;
    private int NamSinh;

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public String getGT() {
        return GT;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public Nguoi() {
    }

    public Nguoi(String Ma, String Ten, String GT, int NamSinh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.GT = GT;
        this.NamSinh = NamSinh;
    }
    
    
    
}
