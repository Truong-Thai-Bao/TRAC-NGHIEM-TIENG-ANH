package com.ttb.baitap;



public class DanhMuc {

    private String loaiDanhMuc;

    public DanhMuc(String loaiDanhMuc) {
        this.loaiDanhMuc = loaiDanhMuc;
    }

    public DanhMuc() {
    }

    @Override
    public String toString() {
        return String.format("%s", this.loaiDanhMuc);
    }

    
    /**
     * @return the loaiDanhMuc
     */
    public String getLoaiDanhMuc() {
        return loaiDanhMuc;
    }

    /**
     * @param loaiDanhMuc the loaiDanhMuc to set
     */
    public void setLoaiDanhMuc(String loai){
            this.loaiDanhMuc = loai;
        }
        
    }

