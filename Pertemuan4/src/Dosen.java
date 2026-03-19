/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen yang merupakan turunan dari Pegawai
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai{
    /***ATRIBUT***/
    protected String fakultas; // menunjukkan fakultas tempat dosen mengajar
    protected static int counterDosen = 0; // atribut static untuk menghitung jumlah dosen yang terdaftar

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public Dosen() {
        super();
        counterDosen++;
    }
    // konstruktor dengan parameter
    public Dosen(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, Nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }
    /***SELEKTOR***/
    // Selektor Fakultas
    public String getFakultas() {
        return fakultas;
    }
    /***MUTATOR***/
    // mutator fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    /***OPERATOR TAMBAHAN***/
    // mengembalikan banyaknya Dosen
    public static int getCounterDosen() {
        return counterDosen;
    }
    // menampilkan banyaknya Dosen
    public static void printCounterDosen() {
        System.out.println("Jumlah dosen yang terdaftar adalah " + Dosen.getCounterDosen() + " orang");
    }
    // menampilkan info lengkap dari seorang Dosen
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas                : " + this.getFakultas());
    }
}