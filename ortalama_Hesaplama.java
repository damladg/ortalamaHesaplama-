import java.util.Scanner;

public class ortalama_Hesaplama {
    public static void main(String[] args) {
        // matematik, fizik, kimya, türkçe,tarih, müzik derslerinin sınav puanlarını ve ortalamasını hesapla
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalama : " + ortalama);

        String durum = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Durum: " + durum);









    }
}