
import java.util.List;


public abstract class CauHoi {

	private String noiDung;

	private Do_Kho doKho;

	public abstract void noiDungCauHoi();

	public abstract boolean isKetQua(List<PhuongAn> phuongAn);

	public abstract void chonPA(PhuongAn phuongAn);

}
