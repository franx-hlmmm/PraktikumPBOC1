/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara anjing.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */


public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk guk guk");
    }
}