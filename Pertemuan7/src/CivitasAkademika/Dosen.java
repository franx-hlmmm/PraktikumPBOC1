/* Nama File    : Dosen.java
 * Deskripsi    : Membuat class Dosen sebagai subclass dari Civitasakademika dengan atribut NIP.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package CivitasAkademika;
public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }

    public String getNIP() {
        return NIP;
    }
}
