package com.example.tugas_recyclerview;

import android.graphics.drawable.Icon;

public class Games {
    private String judul,dev,tahun;
    private int img;

    public Games(int img, String judul, String dev, String tahun){
        this.img= img;
        this.judul = judul;
        this.dev = dev;
        this.tahun = tahun;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }
    public String getJudul(){
        return judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getDev(){
        return dev;
    }

    public void setDev(String dev){
        this.dev = dev;
    }

    public String getTahun(){
        return tahun;
    }

    public void setTahun(String tahun){
        this.tahun = tahun;
    }
}
