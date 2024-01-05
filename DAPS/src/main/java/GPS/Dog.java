package GPS;

public class Dog extends Animal{
    private String quocgia;
    //get

    public String getQuocgia() {
        return quocgia;
    }
    //set

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }
//ngầm định
    public Dog() {
    }
//tường minh
    public Dog(String quocgia, String ma, String ten, String GT, int nam) {
        super(ma, ten, GT, nam);
        this.quocgia = quocgia;
    }
    
    @Override
    public int tinhTuoiConLai() {
        return 10-(2023-getNam());
    }
    
}
