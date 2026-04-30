/* Nama File    : PNS.java
 * Deskripsi    : Berisi atribut dan method dari kelas PNS yang merupakan turunan dari kelas Manusia
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit; //buat menghitung berapa hari antara hari ini - hari awal masuk kerja

public class PNS extends Manusia implements Pajak {
    /***ATRIBUT***/
    private String nip;
    private static int counterPNS = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    public PNS(String nama, String alamat, LocalDate tgl, double pendapatan, String nip) {
        super(nama, alamat, tgl, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    /***SELEKTOR***/
    public String getNIP() {
        return nip;
    }
    /***MUTATOR***/
    public void setNIP(String nip) {
        this.nip = nip;
    }
    /***OPERATOR TAMBAHAN***/
    // Menghitung masa kerja dalam hari lalu ditambah dengan digit NIM ke 14
    @Override
    public int hitungMasaKerja() {
        // Kamus Lokal
        long hari;
        // Algoritma
        hari = ChronoUnit.DAYS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) hari + 3; 
    }

    // Menghitung pajak PNS 10% * Pendapatan
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("NIP                 : " + nip);
        super.cetakInfo();
        System.out.println("Pajak (10%)         : " + formatRupiah(hitungPajak()));
        System.out.println("Total Hari Kerja    : " + hitungMasaKerja() + " hari");
    }
    // static method untuk menghitung jumlah PNS yang terdaftar
    public static int getCounterPNS() {
        return counterPNS;
    }
}