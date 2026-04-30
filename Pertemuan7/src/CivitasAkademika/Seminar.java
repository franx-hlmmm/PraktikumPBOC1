/* Nama File    : Seminar.java
 * Deskripsi    : Membuat class Seminar untuk mengelola peserta seminar yang terdiri dari berbagai jenis civitas akademika, seperti 
                  mahasiswa, dosen, dan tendik. Class ini memiliki atribut array untuk menyimpan peserta seminar dan metode untuk 
                  menghitung jumlah peserta, melakukan registrasi peserta, menampilkan daftar peserta, dan menghitung jumlah mahasiswa 
                  yang terdaftar dalam seminar. 
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package CivitasAkademika;
public class Seminar {
    private static CivitasAkademika[] peserta = new CivitasAkademika[100];
    private int countPeserta;

    // b. konstruktor
    public Seminar() {
        countPeserta = 0;
    }

    // c. countPeserta
    public int countPeserta() {
        return countPeserta;
    }

    // d. registrasi
    public void registrasi(CivitasAkademika c) {
        if (countPeserta < 100) {
            peserta[countPeserta] = c;
            countPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // g. tampil peserta
    public void tampilPeserta() {
        for (int i = 0; i < countPeserta; i++) {
            System.out.println(
                peserta[i].getNomor() + " - " + peserta[i].getNama()
            );
        }
    }

    // h. count mahasiswa
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < countPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}
