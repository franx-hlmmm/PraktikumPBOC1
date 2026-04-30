/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi implementasi objek BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {

        /***BANGUN DATAR***/
        System.out.println("------------ BANGUN DATAR ------------");

        /***PERSEGI***/
        System.out.println("------------   PERSEGI   -------------");
        Persegi P1 = new Persegi();
        P1.setSisi(10);
        P1.printInfo();
        System.out.println(" ");

        Persegi P2 = new Persegi(5, "Merah", "Hitam");
        P2.printInfo();
        System.out.println(" ");

        Persegi P3 = new Persegi(10, "Kuning", "Putih");
        P3.printInfo();
        System.err.println("isEqualLuas P1 = P3? " + P3.isEqualLuas(P1));
        System.err.println("isEqualKeliling P1 = P3? " + P3.isEqualKeliling(P1));
        System.out.println(" ");

        /***LINGKARAN***/
        System.out.println("------------   LINGKARAN  ------------");
        Lingkaran L1 = new Lingkaran(7, "Biru", "Kuning");
        L1.printInfo();
        System.out.println(" ");

        Lingkaran L2 = new Lingkaran(14, "Ungu", "Putih");
        L2.printInfo();
        System.err.println("isEqualLuas L1 = L2? " + L2.isEqualLuas(L1));
        System.err.println("isEqualKeliling L1 = L2? " + L2.isEqualKeliling(L1));
        System.out.println(" ");

        /***COUNTER***/
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterPersegi();
        Lingkaran.printCounterLingkaran();
    }
}