package com.ttb.baitap;


import java.util.List;


public abstract class CauHoi {

    private String noiDung;
    private PhuongAn phuongAn;
    private Do_Kho doKho;
    
    public abstract void hienThi();
    public abstract void phuongAn();
    
       
    public CauHoi(String noiDung, PhuongAn phuongAn, Do_Kho doKho) {
        this.noiDung = noiDung;
        this.phuongAn = phuongAn;
        this.doKho = doKho;
    }

    
    
    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the phuonAn
     */
    

    /**
     * @return the doKho
     */
    public Do_Kho getDoKho() {
        return doKho;
    }

    /**
     * @param doKho the doKho to set
     */
    public void setDoKho(Do_Kho doKho) {
        this.doKho = doKho;
    }

    /**
     * @return the phuongAn
     */
    public PhuongAn getPhuongAn() {
        return phuongAn;
    }

    /**
     * @param phuongAn the phuongAn to set
     */
    public void setPhuongAn(PhuongAn phuongAn) {
        this.phuongAn = phuongAn;
    }


   

    

}
