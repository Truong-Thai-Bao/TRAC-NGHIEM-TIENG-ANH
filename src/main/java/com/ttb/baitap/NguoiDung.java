import com.ttb.baitap.CauHinh;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NguoiDung {

    private String hoTen;

    private String queQuan;

    private String gioiTinh;

    private LocalDate ngaySinh;

    private LocalDate ngayGiaNhap;

    public void hienThi() {
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Que quan: " + getQueQuan());
        System.out.println("Gioi tinh: " + getGioiTinh());
        System.out.println("Ngay sinh: " + getNgaySinh().format(DateTimeFormatter.ofPattern(CauHinh.TIME)));
        System.out.println("Ngay gia nhap: " + getNgayGiaNhap().format(DateTimeFormatter.ofPattern(CauHinh.TIME)));
    }

    public NguoiDung(String hoTen, String queQuan, String gioiTinh, LocalDate ngaySinh, LocalDate ngayGiaNhap) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayGiaNhap = ngayGiaNhap;
    }
    public NguoiDung(String hoTen, String queQuan, String gioiTinh, String ngaySinh, String ngayGiaNhap) {
       this(hoTen, queQuan, gioiTinh, LocalDate.parse(ngaySinh,DateTimeFormatter.ofPattern(CauHinh.TIME)),  
               LocalDate.parse(ngayGiaNhap,DateTimeFormatter.ofPattern(CauHinh.TIME)));
    }
    
    public String ngaySinhToString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(CauHinh.TIME);
        return this.ngaySinh.format(formatter);
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public LocalDate getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(LocalDate ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }
    
    

}
