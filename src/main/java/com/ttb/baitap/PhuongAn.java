package com.ttb.baitap;


public class PhuongAn {

    private String noiDungPA;

    private boolean pADung=false;


    public void hienThiPA() {
        System.out.printf("%s ",this.noiDungPA);
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


}
