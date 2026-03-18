/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 11 Mareet 2026
*/

public class BangunDatar {
    /***ATRIBUT***/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar;
    /***METHOD***/
    /***KONSTRUKTOR***/
    public BangunDatar() {
        this(0, "null", "null");
    }
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    /***SELEKTOR***/
    public int getJmlSisi() {
        return this.jmlSisi;
    }
    public String getWarna() {
        return this.warna;
    }
    public String getBorder() {
        return this.border;
    }
    /***MUTATOR***/
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setBorder(String border) {
        this.border = border;
    }
    /***OPERATOR TAMBAHAN***/
    /***MENAMPILKAN INFO LENGKAP BANGUN DATAR***/
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    /***MENGEMBALIKAN JUMLAH BANGUN DATAR YANG SUDAH ADA***/
    public static int getCounterBangunDatar() {
        return BangunDatar.counterBangunDatar;
    }
    /**MENAMPILKAN JUMLAH BANGUN DATAR YANG SUDAH ADA***/
    public static void printJmlBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + BangunDatar.getCounterBangunDatar());
    }
}
