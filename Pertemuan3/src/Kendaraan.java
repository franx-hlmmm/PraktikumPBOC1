/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 11 Mareet 2026
*/

public class Kendaraan {
    /***ATRIBUT***/
    private String noPlat;
    private String jenis;
    private static int countKendaraan; 

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Kendaraan() {
        this("Kosong", "Kosong");
        countKendaraan++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

    public Kendaraan(String noPlat, String jenis) {
        if(jenis.equals("motor") || jenis.equals("mobil")){
            this.noPlat = noPlat;
            this.jenis = jenis;
            countKendaraan++;
        }
    }

    /***SELEKTOR***/
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    /***MUTATOR***/
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /***OPERATOR TAMBAHAN***/
    /***MENGEMBALIKAN BANYAKNYA KENDARAAN YANG SUDAH DI BUAT***/
    public static int getCountKendaraan(){
        return Kendaraan.countKendaraan;
    }

    /***MENAMPILKAN JUMLAH KENDARAAN***/
    public static void printCountKendaraan(){
        System.out.println("Jumlah Kendaraan : " + Kendaraan.getCountKendaraan());
    }

    /***MENAMPILKAN INFORMASI LENGKAP KENDARAAN***/
    public void printKendaraan() {
        System.out.println("No Plat: " + noPlat + ", Jenis: " + jenis);
    }
}