package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner tara=new Scanner(System.in);
    private static OgrenciIsleri cukurova=new OgrenciIsleri("Çukurova");
    private static Ders d1=new Ders("Matematik",1111,6);
    private static Ders d2=new Ders("Fizik",2222,6);
    private static Ders d3=new Ders("Algoritma",3333,5);
    private static Ders d4=new Ders("Lineer",4444,5);
    private static Ders d5=new Ders("BMG",5555,8);
    private static Ders d6=new Ders("Algo-Lab",6666,4);
    private static Ders d7=new Ders("Fizik-Lab",7777,4);
    private static Ders d8=new Ders("Oral Presentation",8888,4);

    public static void main(String[] args) {

        Ogrenci bedo=new Ogrenci("Bedirhan","SAVAŞ",2015556057);

        System.out.println(bedo.toString());

        System.out.println("Kredi sayınızın 30 u geçmemesine dikkat ediniz");

        int secim;
        boolean cikis=false;
        while (!cikis){
            menuyuGoster();
            System.out.println("Çıkmak için 0 a basınız...");
            secim=tara.nextInt();
            switch (secim){
                case 0:
                    cikis=true;
                    break;
                case 1:
                    tumDersler();
                    break;
                case 2:
                    dersEklemeMethodu();
                    break;
                case 3:
                    dersleriSilmeMethodu();
                    break;
                case 4:
                    dersleriGostermeMethodu();
                    break;

                    default:
                        System.out.println("Lütfen doğru bir rakam giriniz!!!");
            }
        }
    }

    private static void dersleriSilmeMethodu() {
        System.out.println("Silmek istediğiniz dersin kodunu giriniz:");
        int kod=tara.nextInt();

        switch (kod){
            case 1111:
                cukurova.dersSil(d1);
                break;
            case 2222:
                cukurova.dersSil(d2);
                break;
            case 3333:
                cukurova.dersSil(d3);
                break;
            case 4444:
                cukurova.dersSil(d4);
                break;
            case 5555:
                cukurova.dersSil(d5);
                break;
            case 6666:
                cukurova.dersSil(d6);
                break;
            case 7777:
                cukurova.dersSil(d7);
                break;
            case 8888:
                cukurova.dersSil(d8);
                break;
                default:
                    System.out.println("Lütfen geçerli bir kod giriniz!!!");
                    break;
        }
    }
    private static void tumDersler() {
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        System.out.println(d6.toString());
        System.out.println(d7.toString());
        System.out.println(d8.toString());
    }

    private static void dersleriGostermeMethodu() {
        cukurova.dersleriGoster();
    }

    private static void dersEklemeMethodu() {
        System.out.println("Eklemek istediğiniz dersin kodunu giriniz:");
        int kod=tara.nextInt();
        switch (kod){
            case 1111:
                cukurova.dersEkle(d1);
                break;
            case 2222:
                cukurova.dersEkle(d2);
                break;
            case 3333:
                cukurova.dersEkle(d3);
                break;
            case 4444:
                cukurova.dersEkle(d4);
                break;
            case 5555:
                cukurova.dersEkle(d5);
                break;
            case 6666:
                cukurova.dersEkle(d6);
                break;
            case 7777:
                cukurova.dersEkle(d7);
                break;
            case 8888:
                cukurova.dersEkle(d8);
                break;
                default:
                    System.out.println("Yanlış bir kod girdiniz");
                    break;
        }
    }

    private static void menuyuGoster() {
        System.out.println("************ MENÜ ***********");
        System.out.println("1-- Tüm Dersler");
        System.out.println("2-- Ders Ekle");
        System.out.println("3-- Ders Sil");
        System.out.println("4-- Eklediğiniz Dersler");
    }
}
