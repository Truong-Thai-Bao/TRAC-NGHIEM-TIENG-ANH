
import java.util.List;

public class MultipleChoice extends CauHoi {
    
    private DanhMuc danhMuc;
    private String ghiChu;

    public MultipleChoice( String noiDung, List<PhuongAn> phuongAn, Do_Kho doKho,DanhMuc danhMuc, String ghiChu) {
        super(noiDung, phuongAn, doKho);
        this.danhMuc = danhMuc;
        this.ghiChu = ghiChu;
    }

    
    @Override
    public void noiDung() {
        System.out.println(super.getNoiDung());
    }

    @Override
    public void phuongAn() {
        System.out.println(super.getPhuongAn());
    }


}
