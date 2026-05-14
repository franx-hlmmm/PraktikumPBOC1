/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum sebagai wadah (container) untuk sebuah nilai bertipe generik.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 1 Mei 2026
 */

public class Datum <T> {
    private T isi;

    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
