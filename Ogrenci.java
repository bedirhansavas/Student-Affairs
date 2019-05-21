package com.company;

public class Ogrenci {
    private String isim;
    private String soyIsim;
    private int numara;

    public Ogrenci(String isim, String soyIsim, int numara) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.numara = numara;
    }

    public Ogrenci(){

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Öğrencinin ADI: "+getIsim()+"\nÖğrencinin SOYADI: "+getSoyIsim()+"\nÖğrencinin NUMARASI: "+getNumara();
    }
}
