/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas yang berisi prosedur generik Tukar untuk menukar isi dua wadah generik (Datum).
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 1 Mei 2026
 */

public class OperatorGenerik{
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
    
    public <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot(); 
    }
}
