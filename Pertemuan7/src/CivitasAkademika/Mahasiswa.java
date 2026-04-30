/* Nama File    : Mahasiswa.java
 * Deskripsi    : Membuat class Mahasiswa sebagai subclass dari Civitasakademika dengan atribut NIM dan dosen wali. 
                  Class ini memiliki method untuk mengatur dosen wali dan menampilkan data mahasiswa, termasuk NIM, 
                  nama, dan nama dosen wali. Method getNomor di override untuk mengembalikan NIM sebagai nomor identitas mahasiswa.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package CivitasAkademika;
public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public String getNIM() {
        return NIM;
    }

    // i. set wali
    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    // j. tampil data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + nama);
        System.out.println("Wali  : " + dosenWali.getNama());
        System.out.println("--------------------------------");
    }
}