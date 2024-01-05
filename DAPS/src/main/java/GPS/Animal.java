package GPS;

abstract public class Animal {
    private String ma;
    private String ten;
    private String GT;
    private int nam;
    //get

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGT() {
        return GT;
    }

    public int getNam() {
        return nam;
    }
    //set

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    //ngầm định
    public Animal() {
    }
    //tường minh

    public Animal(String ma, String ten, String GT, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.GT = GT;
        this.nam = nam;
    }
    public abstract int tinhTuoiConLai();
    
}
