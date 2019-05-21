package com.company;

public class OgrenciIsleri {
    private String isim;
    private int sayac;
    private Ders[] dersler;



    public OgrenciIsleri(String isim){
        this.isim=isim;
        dersler =new Ders[8];
        sayac=0;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ders[] getDersler() {
        return dersler;
    }

    public void setDersler(Ders[] dersler) {
        this.dersler = dersler;
    }

    public void dersEkle(Ders ders) {

        int toplam=0;

        for (int i=0;i<sayac;i++){
            if(dersler[i].getDersKodu()==ders.getDersKodu()){
                System.out.println("Bu dersi daha önceden eklediniz!!!");
                return;
            }
        }


        ders.setOgrenciIsleri(this);
        this.dersler[sayac] = ders;
        sayac++;

        for (int i = 0; i < sayac; i++) {

            toplam=toplam+dersler[i].getKredi();

            if(toplam>30){
                System.out.println("Kredi sayınız çok fazla lütfen ders çıkartınız!!!");
                break;
            }

        }
        krediHesaplama();

    }

    public void dersSil(Ders gelenders){
        for (int i=0;i<sayac;i++){
            if (dersler[i].getDersKodu()==gelenders.getDersKodu()){
                dersler[i]=null;
                sayac--;

            }
        }

    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public void dersleriGoster(){
        System.out.println("Seçtiğiniz Dersler");

        if(sayac==0){
            System.out.println("Henüz ders eklemediniz ders eklemek için lütfen 2 yi tuşlayınız");
            return;
        }

        for (int i=0;i<dersler.length;i++){
            System.out.println(dersler[i]);
        }
        krediHesaplama();

    }

    public void krediHesaplama(){
        int toplam = 0;
        for(int i=0;i<sayac;i++){
            toplam=toplam+dersler[i].getKredi();
        }
        System.out.println("Toplam Krediniz--> "+toplam);
    }



}
