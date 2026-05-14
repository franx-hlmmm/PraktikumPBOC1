/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk Anabul yang mendefinisikan atribut nama serta perilaku gerak dan bersuara.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */


public class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void Gerak() {
        System.out.println(getNama() + " sedang bergerak");
    }

    public void Bersuara() {
        System.out.println(getNama() + " bersuara");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "'}";
    }
}