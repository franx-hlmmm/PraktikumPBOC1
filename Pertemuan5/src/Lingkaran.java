/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran yang merupakan turunan dari Bangun Datar
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    /***ATRIBUT***/
    private double jari; // menunjukkan jari-jari lingkaran
    private static int counterLingkaran = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public Lingkaran() {
        super();
        setJmlSisi(1);
        counterLingkaran++;
    }
    // konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }

    /***SELEKTOR***/
    // selektor jari-jari
    public double getJari() {
        return jari;
    }

    // mutator jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    /***OPERATOR TAMBAHAN***/
    // menghitung luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // menghitung keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // mengembalikan banyaknya objek lingkaran
    public static int getCounterLingkaran() {
        return counterLingkaran;
    }

    // menampilkan banyaknya objek Lingkaran
    public static void printCounterLingkaran() {
        System.out.println("Jumlah Objek Lingkaran: " + Lingkaran.getCounterLingkaran());
    }

    // menampilkan info lengkap lingkaran
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil method dari superclass
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}