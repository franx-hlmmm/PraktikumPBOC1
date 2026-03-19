/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu yang merupakan turunan dari Dosen
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    /***ATRIBUT***/
    private String NIDK; // Nomor Induk Dosen Khusus
    private LocalDate tglAkhirKontrak; // Menunjukkan tanggal batas akhir kontrak
    private static int counterDosenTamu = 0; // variable static untuk menghitung dosen tamu yang telah terdaftar

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public DosenTamu() {
        counterDosenTamu++;
    }
    // konstruktor dengan parameter
    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tglAkhirKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
        counterDosenTamu++;
    }
    /***SELEKTOR***/
    // selektor NIDK
    public String getNIDK() {
        return NIDK;
    }
    // selektor tanggal akhir kontrak
    public LocalDate getTglAkhirKontrak() {
        return tglAkhirKontrak;
    }
    /***MUTATOR***/
    // mutator NIDK
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }
    // mutator tanggal akhir kontrak
    public void setTglAkhirKontrak(LocalDate tglAkhirKontrak) {
        this.tglAkhirKontrak = tglAkhirKontrak;
    }
    /***OPERATOR TAMBAHAN***/
    // mengembalikan besaran tunjangan yang didapatkan dengan rumus 2,5% * gaji pokok
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }
    // mengembalikan lamanya kontrak dalam hitungan tahun bulan
    public String getMasaKontrak() {
        // Kamus Lokal
        Period p;
        // Algoritma
        p = Period.between(TMT, tglAkhirKontrak);
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }
    // mengembalikan banyaknya dosen tamu yang telah terdaftar
    public static int getCounterDosenTamu() {
        return counterDosenTamu;
    }
    // menampilkan banyaknya dosen tamu yang telah terdaftar
    public static void printCounterDosenTamu() {
        System.out.println("Jumlah dosen tamu yang telah terdaftar adalah " + DosenTamu.getCounterDosenTamu() + " orang");
    }
    // menampilkan info lengkap seorang dosen tamu
    @Override
    public void printInfo() {
        super.printNIP();
        System.out.println("NIDK                    : " + getNIDK());
        super.printInfoSederhana();
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Fakultas                : " + getFakultas());
        super.printMasaKerja();
        System.out.println("Masa Kontrak            : " + getMasaKontrak());
        System.out.println("Tanggal Akhir Kontrak   : " + formatTanggal(getTglAkhirKontrak()));
        super.printGajiPokok();
        System.out.println("Tunjangan               : 2,5% x "+ formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}
