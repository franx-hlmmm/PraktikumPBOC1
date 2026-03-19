/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

import java.text.NumberFormat; // buat rupiah
import java.time.LocalDate; // buat ngambil tanggal local
import java.time.Period; // buat hitung masa kerja
import java.time.format.DateTimeFormatter; // buat memformat tanggal agar terpisah tanggal bulan tahun
import java.util.Locale; // buat ngambil bahasa Indonesia misal buat format bulan yang tadinya May jadi Mei dan format mata uang biar jadi Rp 1.000.000,00 contoh

public class Pegawai {
    /***ATRIBUT***/
    protected String NIP; // Nomor Induk Pegawai
    protected String nama; // Nama Pegawai
    protected LocalDate tglLahir; // Tanggal Lahir
    protected LocalDate TMT; // Terhitung Mulai Tanggal / Tanggal Awal Bekerja
    protected double gajiPokok; // gaji pokok seorang pegawai
    protected static int counterPegawai = 0; // variabel static untuk menghitung jumlah pegawai yang terdaftar

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public Pegawai() {
        counterPegawai++;
    }
    // konstruktor dengan parameter
    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    /***SELEKTOR***/
    // mengembalikan nilai NIP dari seorang pegawai
    public String getNIP() { 
        return NIP; 
    }
    // mengembalikan Nama dari seorang pegawai
    public String getNama() { 
        return nama; 
    }
    // mengembalikan tanggal lahir dari seorang pegawai
    public LocalDate getTglLahir() { 
        return tglLahir; 
    }
    // mengembalikan Tanggal Terhitung Bekerja dari seorang pegawai
    public LocalDate getTMT() { 
        return TMT; 
    }
    // mengembalikan nilai gaji pokok dari seorang pegawai
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    // mengembalikan jumlah Pegawai yang terdaftar
    public static int getCounterPegawai() {
        return counterPegawai;
    }

    /***MUTATOR***/
    // mengubah nilai NIP seorang pegawai
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }
    // mengubah Nama seorang pegawai
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    // mengubah tanggal lahir seorang pegawai
    public void setTglLahir(LocalDate tglLahir) { 
        this.tglLahir = tglLahir; 
    }
    // mengubah tanggal masuk seorang pegawai
    public void setTMT(LocalDate TMT) { 
        this.TMT = TMT; 
    }
    // mengubah nilai gaji pokok seorang pegawai
    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    /***OPERATOR TAMBAHAN***/
    // Menghitung masa kerja seorang pegawai
    public String getMasaKerja() {
        // Kamus Lokal
        Period p;
        // Algoritma
        p = Period.between(TMT, LocalDate.now()); // untuk menghitung masa antara Tanggal Sekarang - TMT
        return p.getYears() + " tahun " + p.getMonths() + " bulan"; // p.years buat ngambil tahun, p.months ngambil sisa bulannya
    }
    // menampilkan jumlah pegawai yang terdaftar
    public static void printCounterPegawai() {
        System.out.println("Jumlah pegawai yang telah terdaftar adalah " + Pegawai.getCounterPegawai() + " orang");
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
    // untuk mendapatkan tahun masa kerja
    public int getTahunKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }
    // menampilkan info seorang pegawai, tidak langsung ditampilkan semua untuk mempermudah pemanggilan super agar tidak perlu mengurutkan dari awal
    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tglLahir));
        System.out.println("TMT             : " + formatTanggal(TMT));
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    }
    // buat ngegampangin waktu overriding soalnya struktur urutannya beda
    public void printInfoSederhana() {
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tglLahir));
        System.out.println("TMT             : " + formatTanggal(TMT));
    }
    public void printNIP() {
        System.out.println("NIP             : " + NIP);
    }
    public void printMasaKerja() {
        System.out.println("Masa Kerja      : " + getMasaKerja());
    }
    public void printGajiPokok() {
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    } 
}