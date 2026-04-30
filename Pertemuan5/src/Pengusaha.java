/* Nama File    : Pengusaha.java
 * Deskripsi    : Berisi atribut dan method dari kelas Pengusaha yang merupakan turunan dari kelas Manusia
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    /***ATRIBUT***/
    private String npwp;
    private static int counterPengusaha = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Pengusaha(String nama, String alamat, LocalDate tgl, double pendapatan, String npwp) {
        super(nama, alamat, tgl, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    /***SELEKTOR***/
    public String getNPWP() {
        return npwp;
    }
    /***MUTATOR***/
    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }
    /***OPERATOR TAMBAHAN***/
    // Menghitung masa kerja dalam hari lalu ditambah dengan digit NIM ke 13
    @Override
    public int hitungMasaKerja() {
        // Kamus Lokal
        long hari;
        // Algoritma (Konstanta B = 0)
        hari = ChronoUnit.DAYS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) hari + 0;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("NPWP                : " + npwp);
        super.cetakInfo();
        System.out.println("Pajak (15%)         : " + formatRupiah(hitungPajak()));
        System.out.println("Total Hari Kerja    : " + hitungMasaKerja() + " hari");
    }
    // static method untuk menghitung jumlah Pengusaha yang terdaftar
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}