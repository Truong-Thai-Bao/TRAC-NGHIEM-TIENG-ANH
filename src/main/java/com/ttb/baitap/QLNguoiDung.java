
import com.ttb.baitap.CauHinh;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QLNguoiDung {

    private List<NguoiDung> ds;
    private int choice; 

    public QLNguoiDung(List<NguoiDung> ds) {
        this.ds = ds;
    }

    public QLNguoiDung() {
        this.ds = new ArrayList<>();
    }

    public void hienThiDSNguoiDung() {
        for (NguoiDung nguoiDung : ds) {
            nguoiDung.hienThi();
            System.out.println("");
        }
    }

    public List<NguoiDung> traCuu(String s) {
        List<NguoiDung> ketQua = new ArrayList<>();
        for (NguoiDung nguoiDung : ds) {
            if (nguoiDung.getHoTen().contains(s) || nguoiDung.getQueQuan().contains(s)
                    || nguoiDung.getGioiTinh().contains(s) || nguoiDung.getNgaySinh().toString().contains(s)) {
                ketQua.add(nguoiDung);
            }
        }
        return ketQua;
    }

    public void themNguoiDung(NguoiDung... a) {
       this.ds.addAll(Arrays.asList(a));
    }

    public void themNguoiHoc() {
        System.out.print("Nhap ho ten: ");
        String hoTen = CauHinh.SC.nextLine();
        System.out.print("Nhap que quan: ");
        String queQuan = CauHinh.SC.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = CauHinh.SC.nextLine();
        System.out.print("Nhap ngay sinh (yyyy-MM-dd): ");
        LocalDate ngaySinh = LocalDate.parse(CauHinh.SC.nextLine());
        System.out.print("Nhap ngay gia nhap (yyyy-MM-dd): ");
        LocalDate ngayGiaNhap = LocalDate.parse(CauHinh.SC.nextLine());

        NguoiDung nguoiDung = new NguoiDung(hoTen, queQuan, gioiTinh, ngaySinh, ngayGiaNhap);
        ds.add(nguoiDung);
        System.out.println("Da them nguoi hoc: " + hoTen);
    }

    public void xoaNguoiDung(String ten) {
        NguoiDung nguoiDungXoa = null;
        for (NguoiDung nguoiDung : ds) {
            if (nguoiDung.getHoTen().equals(ten)) {
                nguoiDungXoa = nguoiDung;
                break;
            }
        }

        if (nguoiDungXoa != null) {
            ds.remove(nguoiDungXoa);
            System.out.println("Da xoa nguoi dung co ten: " + ten);
        } else {
            System.out.println("Khong tim thay nguoi dung co ten: " + ten);
        }
    }

    public void capNhatThongTin(String ten) {

        for (NguoiDung nguoiDung : ds) {
            if (nguoiDung.getHoTen().equals(ten)) {
                nguoiDung.hienThi();
                System.out.println("Ban muon cap nhat thuoc tinh nao hay nhap so tuong ung:");
                System.out.println("1. Ho ten");
                System.out.println("2. Que quan");
                System.out.println("3. Gioi tinh");
                System.out.println("4. Ngay sinh");
                System.out.println("5. Ngay gia nhap");
                
                choice = CauHinh.SC.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Nhap ho ten moi: ");
                        String hoTenMoi = CauHinh.SC.nextLine();
                        nguoiDung.setHoTen(hoTenMoi);
                        System.out.println("Da cap nhat ho ten.");
                    }
                    case 2 -> {
                        System.out.print("Nhap que quan moi: ");
                        String queQuanMoi = CauHinh.SC.nextLine();
                        nguoiDung.setQueQuan(queQuanMoi);
                        System.out.println("Da cap nhat que quan.");
                    }
                    case 3 -> {
                        System.out.print("Nhap gioi tinh moi: ");
                        String gioiTinhMoi = CauHinh.SC.nextLine();
                        nguoiDung.setGioiTinh(gioiTinhMoi);
                        System.out.println("Da cap nhat gioi tinh.");
                    }
                    case 4 -> {
                        System.out.print("Nhap ngay sinh moi (yyyy-MM-dd): ");
                        LocalDate ngaySinhMoi = LocalDate.parse(CauHinh.SC.nextLine());
                        nguoiDung.setNgaySinh(ngaySinhMoi);
                        System.out.println("Da cap nhat ngay sinh.");
                    }
                    case 5 -> {
                        System.out.print("Nhap ngay gia nhap moi (yyyy-MM-dd): ");
                        LocalDate ngayGiaNhapMoi = LocalDate.parse(CauHinh.SC.nextLine());
                        nguoiDung.setNgayGiaNhap(ngayGiaNhapMoi);
                        System.out.println("Da cap nhat ngay gia nhap.");
                    }
                    default -> System.out.println("Lua chon khong hop le.");
                }
                
                break;
            }
        }
        
    }

}
