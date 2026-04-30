/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara kucing.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package Anabul;
public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara miaw");
    }
}
