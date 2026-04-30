/* Nama File    : Petani.java
 * Deskripsi    : Berisi atribut dan method dalam kelas Petani yang merupakan turunan dari kelas Manusia
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    /***ATRIBUT***/
    private String asal_kota;
    private static int counterPetani = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Petani(String nama, String alamat, LocalDate tgl, double pendapatan, String asal) {
        super(nama, alamat, tgl, pendapatan);
        this.asal_kota = asal;
        counterPetani++;
    }
    /***SELEKTOR***/
    public String getAsalKota() {
        return asal_kota;
    }
    /***MUTATOR***/
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    /***OPERATOR TAMBAHAN***/
    // Menghitung masa kerja dalam hari lalu ditambah dengan digit NIM ke 12
    @Override
    public int hitungMasaKerja() {
        // Kamus Lokal
        long hari;
        // Algoritma (Konstanta C = 0)
        hari = ChronoUnit.DAYS.between(tgl_mulai_kerja, LocalDate.now());
        return (int) hari + 0;
    }

    // Menghitung pajak petani = 0
    @Override
    public double hitungPajak() {
        return 0; // Petani bebas pajak sesuai rumus
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota);
        System.out.println("Pajak               : " + formatRupiah(hitungPajak()));
        System.out.println("Total Hari Kerja    : " + hitungMasaKerja() + " hari");
    }

    // static method untuk menghitung jumlah petani yang telah terdaftar
    public static int getCounterPetani() {
        return counterPetani;
    }
}