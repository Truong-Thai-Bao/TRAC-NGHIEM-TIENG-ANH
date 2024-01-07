
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCauHoi {

    private List<CauHoi> ds;

    public List<CauHoi> timCauHoi(String kw) {
        List<CauHoi> kq = new ArrayList<>();
        for (CauHoi cauHoi : this.ds) {
            if (cauHoi.getNoiDung().contains(kw) || cauHoi instanceof MultipleChoice
                    && ((MultipleChoice) cauHoi).getDanhMuc().equals(kw)) {
                kq.add(cauHoi);
            }
        }

        return kq;
    }

    public List<CauHoi> timCauHoi(Do_Kho doKho) {
        return this.ds.stream().filter(c -> c.getDoKho().equals(doKho)).collect(Collectors.toList());
    }

    public void hienThiDsCauHoi() {
        for (CauHoi c : this.ds) {
            c.noiDung();
        }
    }

}
