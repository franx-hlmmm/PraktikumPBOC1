/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara burung.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package Anabul;
public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara cuit cuit cuit");
    }
}
