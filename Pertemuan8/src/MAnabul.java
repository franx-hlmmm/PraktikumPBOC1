/* Nama File    : MAnabul.java
 * Deskripsi    : Program utama untuk mengilustrasikan konsep generik yakni Datum, OperatorGenerik, Bobot2, dan Data pada keluarga kelas Anabul.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 2 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class MAnabul {
    public static void main(String[] args) {
        // Kamus
        // 2.b. Aplikasi datum pada Kelas Anabul
        System.out.println("\t DATA GENERIK ANABUL \t");
        // Mengisi anabul dengan objek kucing 
        Datum<Anabul> anabul = new Datum<>();
        anabul.setIsi(new Kucing("Bobby", 4.2));
        System.out.println(anabul.getIsi());

        // Mengisi anabul dengan objek Anjing
        anabul.setIsi(new Anjing("Heli"));
        System.out.println(anabul.getIsi());

        // Mengisi anabul dengan objek Burung
        anabul.setIsi(new Burung("Gatot"));
        System.out.println(anabul.getIsi()); 

        Datum<Kucing> a1 = new Datum<>();
        // Mengisi a1 dengan objek Kembangtelon
        a1.setIsi(new Kembangtelon("Chiko", 5.3));
        System.out.println(a1.getIsi());
        
        // Mengisi a1 dengan objek Anggora
        a1.setIsi(new Anggora("Neko", 4.7));
        System.out.println(a1.getIsi());

        System.out.println("\n\t OPERATOR GENERIK TUKAR & BOBOT2 \t");
        // 3.b. Aplikasi prosedur generik tukar pada operator generik
        // Untuk Integer 
        System.out.println("\nTUKAR INTEGER");
        Datum<Integer> int1 = new Datum<>(6);
        Datum<Integer> int2 = new Datum<>(7);
        OperatorGenerik operator = new OperatorGenerik();

        System.out.println("Sebelum ditukar");
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        System.out.println("Setelah ditukar");
        operator.Tukar(int1, int2);
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        // Untuk String
        System.out.println("\nTUKAR STRING");
        Datum<String> str1 = new Datum<>("Windah");
        Datum<String> str2 = new Datum<>("Basudara");
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        System.out.println("Setelah ditukar");
        operator.Tukar(str1, str2);
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        // Untuk Anabul
        System.out.println("\nTUKAR ANABUL");
        Datum<Anabul> anabul1 = new Datum<>(new Kucing("Doraemon", 2.4));
        Datum<Anabul> anabul2 = new Datum<>(new Anjing("Scooby-Doo"));
        
        System.out.println("Sebelum ditukar");
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        System.out.println("Setelah ditukar");
        operator.Tukar(anabul1, anabul2);
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        // 3.c. Aplikasi fungsi generik Bobot2 pada operator generik
        System.out.println("\nHITUNG BOBOT");
        Kucing k1 = new Anggora("Luna", 2.5);
        Kucing k2 = new Kembangtelon("Momo", 3.0);
        System.out.println("Jumlah bobot dua kucing: " + operator.Bobot2(k1, k2) + "kg");

        // Cara kerja konsep generik adalah dengan menyediakan sebuah wadah yang bisa diisi oleh tipe apapun. 
        // kelas generik hanya membuat semacam placeholder agar suatu kelas bisa menerima semua jenis input dan memamnggil operator dari semua jenis kelas terkait yang memiliki method tertentu. 
        // Konsep generik diterapkan pada tipe list dengan objek arraylist karena arraylist harus bisa menerima semua jenis kelas sebagai input

        System.out.println("\n\t LIST DATA PADA TIPE GENERIK \t");
        Data<Anabul> d = new Data<>();

        System.out.println("Jumlah data saat ini: " + d.getSize());
        d.setIsi(1, new Anjing("Dola"));
        d.setIsi(2, new Kucing("Kitty", 2.71));
        System.out.println("Jumlah data saat ini: " + d.getSize());
        System.out.println(d.getIsi(1));
        System.out.println(d.getIsi(2));

        // Penerapan List dengan kelas generik (Datum)
        List<Datum<? extends Anabul>> listPeliharaan = new ArrayList<>();
        listPeliharaan.add(new Datum<>(new Burung("Molly")));
        listPeliharaan.add(new Datum<>(new Kembangtelon("Gembul", 6.7)));
        listPeliharaan.add(new Datum<>(new Anggora("Cimol", 4.9)));
        System.out.println("\nList Peliharaanku:");
        for (Datum<? extends Anabul> item : listPeliharaan) {
            System.out.println(item.getIsi());
        }
        
    }
}