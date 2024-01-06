package com.ttb.baitap;


public class PhuongAn {

    private String noiDungPA;

    private String pADung;

    public PhuongAn(String noiDungPA, String pADung) {
        this.noiDungPA = noiDungPA;
        this.pADung = pADung;
    }

  

    public PhuongAn() {
    }

    @Override
    public String toString() {
        return String.format("%s", this.noiDungPA);
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
    public String getpADung() {
        return pADung;
    }

    /**
     * @param pADung the pADung to set
     */
    public void setpADung(String pADung) {
        this.pADung = pADung;
    }




}
