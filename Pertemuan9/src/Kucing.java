/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara kucing.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

public class Kucing extends Anabul {
    private double bobot;

    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " bersuara miaw");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "', bobot=" + getBobot() + "kg}";
    }
}