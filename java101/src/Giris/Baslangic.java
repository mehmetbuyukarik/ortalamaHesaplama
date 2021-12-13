package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        /* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        derslerinin sınav puanlarını kullanıcıdan alan ve
         ortalamalarını hesaplayıp ekrana bastırılan program */
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        matematik = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz");
        muzik = inp.nextInt();
        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız: "+ ortalama);
        boolean kosul1 = ortalama >60 || ortalama == 60;
        String str = kosul1 ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println(str);



    }
}
