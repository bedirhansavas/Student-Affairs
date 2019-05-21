package com.company;

public class Ders {
    private String isim;
    private int dersKodu;
    private int kredi;
    private OgrenciIsleri ogrenciIsleri;


    public Ders(String isim, int dersKodu, int kredi) {
        this.isim = isim;
        this.dersKodu = dersKodu;
        this.kredi = kredi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public OgrenciIsleri getOgrenciIsleri() {
        return ogrenciIsleri;
    }

    public void setOgrenciIsleri(OgrenciIsleri ogrenciIsleri) {
        this.ogrenciIsleri = ogrenciIsleri;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }



    @Override
    public String toString() {
        return "Dersin Adı: "+isim+" Dersin kodu: "+dersKodu+" Dersin kredisi: "+kredi;
    }
}
