package com.ttb.baitap;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLCauHoi {

	private List<CauHoi> ds;

        public QLCauHoi() {
            this.ds = new ArrayList<>();
        }

	public List<CauHoi> timCauHoi(String noiDung) {
            return getDs().stream().filter(c->c.getNoiDung().toLowerCase().contains(noiDung.toLowerCase())).collect(Collectors.toList());

	}

	public List<CauHoi> timCauHoi(Do_Kho doKho) {
            return getDs().stream().filter(c->c.getDoKho().equals(doKho)).collect(Collectors.toList());

	}

	public List<CauHoi> timCauHoi(DanhMuc danhMuc) {
            List<CauHoi> kq = new ArrayList<>();
            for(CauHoi c: getDs()){
                if(c instanceof MultipleChoice && ((MultipleChoice) c).getDanhMuc().equals(danhMuc))
                   kq.add(c);
            }
            return kq;
	}

        public void docFileMultipleChoice() throws FileNotFoundException{
            File f = new File("src/main/java/com/ttb/baitap/file/Multiple Choice");
            try (Scanner sc = new Scanner(f)) {
                String dm = "";
                while (sc.hasNext()) {
                    String currentLine = sc.nextLine();

                    if (currentLine.startsWith("#")) {
                        dm = currentLine.substring(1);
                    }
                    else
                        sc.nextLine();
                    String nd = sc.nextLine();
                    String ndpa = "";

                    while (sc.hasNext()) {
                        currentLine = sc.nextLine();
                        ndpa += currentLine;

                        if (currentLine.isEmpty()) {
                            break;
                        }
                    }
                    String pad = sc.nextLine();
                    Do_Kho doKho = Do_Kho.fromFileValue(Integer.parseInt(sc.nextLine()));
                    String gc = sc.nextLine();

                    getDs().add(new MultipleChoice(nd, new PhuongAn(ndpa, pad), doKho, new DanhMuc(dm), gc));
                }
            }
        }
        
	public void hienThiDsCauHoi() {
            getDs().forEach(c->c.hienThi());
                }

    /**
     * @return the ds
     */
    public List<CauHoi> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<CauHoi> ds) {
        this.ds = ds;
    }
}
    


