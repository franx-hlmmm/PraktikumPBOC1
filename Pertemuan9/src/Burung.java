/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara burung.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */


public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara cuit cuit cuit");
    }
}