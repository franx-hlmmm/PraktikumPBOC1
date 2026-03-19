/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik yang merupakan turunan dari Pegawai
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    /***ATRIBUT***/
    private String bidang; // bidang pengabdian pegawai 
    private final int BUP = 55; // Batas Usia Pensiun Tendik merupakan atribut final yang tidak boleh diubah
    private static int counterTendik = 0; // atribut static yang menunjukkan banyaknya Tendik 
    /***METHOD***/
    /***KONSTRUKTOR***/
    // Konstruktor tanpa parameter
    public Tendik() {
        counterTendik++;
    }
    // Konstruktor dengan parameter
    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }
    /***SELEKTOR***/
    // mengembalikan bidang pengabdian tendik
    public String getBidang() {
        return bidang;
    }
    /***MUTATOR***/
    // mutator bidang pengabdian tendik
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    /***OPERATOR TAMBAHAN***/
    // mengembalikan besaran tunjangan dengan rumus 1% * masa kerja * gaji pokok
    public double getTunjangan() {
        // Kamus Lokal
        int tahun;
        // Algoritma
        tahun = Period.between(TMT, LocalDate.now()).getYears();
        return 0.01 * tahun * gajiPokok;
    }
    // mengembalikan tanggal pensiun seorang dosen tetap yakni 65 tahun setelah tanggal lahir di bulan berikutnya pada tanggal 1
    public LocalDate getTanggalPensiun() {
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1); // plusyear buat nambahin tahun nya, plusmonth nambahin bulan, with day of month ngasih tahu tanggal berapa pada bulan itu
    }
    // mengembalikan banyaknya Tendik yang telah terdaftar
    public static int getCounterTendik() {
        return counterTendik;
    }
    public static void printCounterTendik() {
        System.out.println("Jumlah Tendik yang telah terdaftar adalah " + counterTendik + " orang");
    }
    // menampilkan info lengkap seornag tendik
    @Override
    public void printInfo() {
        super.printNIP();
        super.printInfoSederhana();
        System.out.println("Bidang                  : " + getBidang());
        super.printMasaKerja();
        System.out.println("Batas Usia Pensiun      : " + BUP + " tahun");
        System.out.println("Tanggal Pensiun         : " + formatTanggal(getTanggalPensiun()));
        super.printGajiPokok();
        System.out.println("Tunjangan               : 1% x "+ getTahunKerja() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}
