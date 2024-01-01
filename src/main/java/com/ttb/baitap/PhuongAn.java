
public class PhuongAn {

    private String noiDungPA;

    private boolean pADung=false;

    private boolean pADuocChon=false;

    private String ghiChuPA;

    public PhuongAn(String noiDungPA, String ghiChuPA) {
        this.noiDungPA = noiDungPA;
        this.ghiChuPA = ghiChuPA;
    }

    public void hienThiPA() {
        System.out.printf("%s ",this.noiDungPA);
        if(this.ghiChuPA.length()>0)
            System.out.printf("- Ghi chu: %s\n",this.ghiChuPA);
    }

    /**
     * @return the noiDungPA
     */
    public String getNoiDungPA() {
        return noiDungPA;
    }

    /**
     * @param noiDungPA the noiDungPA to set
     */
    public void setNoiDungPA(String noiDungPA) {
        this.noiDungPA = noiDungPA;
    }

    /**
     * @return the pADung
     */
    public boolean ispADung() {
        return pADung;
    }

    public void setpADung() {
        this.pADung = true;
    }

    /**
     * @return the pADuocChon
     */
    public boolean ispADuocChon() {
        return pADuocChon;
    }

    public void setpADuocChon() {
        this.pADuocChon = true;
    }

    /**
     * @return the ghiChuPA
     */
    public String getGhiChuPA() {
        return ghiChuPA;
    }

    /**
     * @param ghiChuPA the ghiChuPA to set
     */
    public void setGhiChuPA(String ghiChuPA) {
        this.ghiChuPA = ghiChuPA;
    }
    
    

}
