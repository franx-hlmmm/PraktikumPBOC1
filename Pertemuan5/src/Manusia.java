/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Manusia
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Manusia {
    /***ATRIBUT***/
    protected String nama;
    protected String alamat;
    protected LocalDate tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, String alamat, LocalDate tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /***SELEKTOR***/
    public String getNama() { 
        return nama; 
    }
    public String getAlamat() { 
        return alamat; 
    }
    public LocalDate getTglMulaiKerja() { 
        return tgl_mulai_kerja; 
    }
    public double getPendapatan() { 
        return pendapatan; 
    }

    /***MUTATOR***/
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }
    public void setTglMulaiKerja(LocalDate tgl) { 
        this.tgl_mulai_kerja = tgl; 
    }
    public void setPendapatan(double p) { 
        this.pendapatan = p; 
    }

    /***OPERATOR TAMBAHAN***/
    // Mengembalikan masa kerja dalam format String tahun bulan hari
    public String getMasaKerja() {
        // Kamus Lokal
        Period p;
        // Algoritma
        p = Period.between(tgl_mulai_kerja, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan " + p.getDays() + " hari";
    }

    // fungsi tambahan untuk tampilan tanggal yang terformat
    public String formatTanggal(LocalDate tgl) {
        // Kamus Lokal
        DateTimeFormatter format;
        // Algoritma
        format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID")); //pattern d MMMM yyyy dipakai untuk menghasilkan format <hari> <nama bulan> <tahun> 5 May 2025 Locale ID dipakai untuk menerjemahkan penamaan bulan dari EN ke ID agar jadi 5 Mei 2025
        return tgl.format(format);
    }
    // fungsi tambahan untuk tampilan mata uang rupiah yang terformat
    public String formatRupiah(double angka) {
        // Kamus Lokal
        NumberFormat nf;
        // Algoritma
        nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); // mengambil currency atau mata uang indo beserta standar penulisannya output nya Rp1.000.000,00
        return nf.format(angka).replace("Rp", "Rp "); // biar ke penulisan Rp nya ke spasi jadi Rp 1.000.000,00 
    }

    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Tanggal Mulai Kerja : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Masa Kerja          : " + getMasaKerja());
        System.out.println("Pendapatan          : " + formatRupiah(pendapatan));
    }

    // Abstract method untuk menghitung total hari kerja
    public abstract int hitungMasaKerja();

    // static method untuk menghitung jumlah manusia yang terdaftar
    public static int getCounterMns() {
        return counterMns;
    }
}