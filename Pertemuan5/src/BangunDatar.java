/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Bangun Datar
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

public abstract class BangunDatar {
    /***ATRIBUT***/
    protected int jmlSisi; // menunjukkan jumlah sisi bangun datar
    protected String warna; // menunjukkan warna yang ada pada bangun datar 
    protected String border; // menunjukkan border pada bangun datar
    protected static int counterBangunDatar = 0; // atribut static untuk menghitung bangun datar yang terbentuk

    /***METHOD***/
    /***KONSTRUKTOR***/
    // konstruktor tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }
    // konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    /***SELEKTOR***/
    // selektor jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }
    // selektor warna
    public String getWarna() {
        return warna;
    }
    // selektor Border
    public String getBorder() {
        return border;
    }
    /***MUTATOR***/
    // mutator jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    // mutator warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
    // mutator border
    public void setBorder(String border) {
        this.border = border;
    }
    // 
    /***OPERATOR TAMBAHAN***/
    // menampilkan info lengkap sebuah bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    // mengmebalikan besaran luas
    public abstract double getLuas();
    // mengembalikan besaran keliling
    public abstract double getKeliling();
    // mengembalikan jumlah objek bangun datar yang berhasil terbentuk
    public static int getCounterBangunDatar() {
        return counterBangunDatar;
    }
    // mengembalikan true/false cek kesamaan luas
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    // mengembalikan true/false cek kesamaan Keliling
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
    // menampilkan jumlah objek bangun datar yang sudah tercetak 
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek: " + BangunDatar.getCounterBangunDatar());
    }
}