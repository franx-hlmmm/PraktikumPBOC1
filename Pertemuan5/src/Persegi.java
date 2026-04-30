/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi yang merupakan turunan dari Bangun Datar
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize {
    /***ATRIBUT***/
    private double sisi; // menunjukkan panjang sisi persegi
    private static int counterPersegi = 0; // atribut static untuk menghitung objek persegi yang berhasil terbentuk

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public Persegi() {
        super(); // memanggil konstruktor BangunDatar
        this.jmlSisi = 4; // bisa karena habis diupdate jadi protected dan masih berada di satu folder yakni src
        counterPersegi++;
    }

    // konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); // memanggil konstruktor superclass
        this.sisi = sisi;
        counterPersegi++;
    }

    /***SELEKTOR***/
    // selektor sisi
    public double getSisi() {
        return sisi;
    }

    // mutator sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /***OPERATOR TAMBAHAN***/
    // menghitung luas persegi
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // menghitung keliling persegi
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // menghitung panjang diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2*(sisi*sisi));
    }
    
    // mengembalikan banyaknya objek persegi
    public static int getCounterPersegi() {
        return counterPersegi;
    }

    // menampilkan banyaknya objek persegi
    public static void printCounterPersegi() {
        System.out.println("Jumlah Objek Persegi: " + Persegi.getCounterPersegi());
    }

    // Zoom
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100.0;
    }

    // menampilkan info lengkap persegi
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil method dari superclass
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}