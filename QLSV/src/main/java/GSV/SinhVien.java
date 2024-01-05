
package GSV;

/**
 *
 * @author Giang Nguyễn
 */
public class SinhVien extends Nguoi{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public SinhVien() {
    }

    public SinhVien(String id, String Ma, String Ten, String GT, int NamSinh) {
        super(Ma, Ten, GT, NamSinh);
        this.id = id;
    }
    
    
    
}
