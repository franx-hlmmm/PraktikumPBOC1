/* Nama File    : MManusia.java
 * Deskripsi    : Main driver untuk menguji class PNS, Pengusaha, dan Petani
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // Membuat objek PNS, Pengusaha, dan Petani
        // Format: Nama, Alamat, Tanggal Kerja, Pendapatan, ID (NIP/NPWP/Kota)
        PNS p1 = new PNS("Satriyo", "Jl. Seroja", LocalDate.of(2006, 4, 1), 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "Jl. Air", LocalDate.of(2000, 1, 1), 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "Jl. Bunga 9 Tembalang", LocalDate.of(1977, 1, 9), 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", "", LocalDate.of(2010, 4, 1), 10000000, "198004212010041002");
        // set alamat p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // Menampilkan jumlah objek yang tercipta 
        System.out.println("Jumlah Manusia    = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());

        System.out.println("-------------------------------------------");

        // Menampilkan perhitungan Pajak
        System.out.println("Pajak PNS p1        = " + p1.formatRupiah(p1.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 = " + pe1.formatRupiah(pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1    = " + pt1.formatRupiah(pt1.hitungPajak()));

        System.out.println("-------------------------------------------");

        // Menampilkan Masa Kerja (dalam total hari + konstanta NIM)
        System.out.println("Masa Kerja p1       = " + p1.hitungMasaKerja() + " hari");
        System.out.println("Masa Kerja pe1      = " + pe1.hitungMasaKerja() + " hari");
        System.out.println("Masa Kerja pt1      = " + pt1.hitungMasaKerja() + " hari");

        System.out.println("-------------------------------------------");

        // Memanggil method cetakInfo() untuk detail lengkap
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
    }
}