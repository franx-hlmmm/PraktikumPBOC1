/* Nama File    : Main.java
 * Deskripsi    : Membuat class Main untuk menguji konsep polimorfisme universal inclusion dengan membuat array dari tipe CivitasAkademika 
                  yang dapat menyimpan objek dari berbagai jenis civitas akademika, seperti mahasiswa, dosen, dan tendik. 
                  Class ini juga melakukan registrasi peserta seminar, menghitung jumlah peserta, menampilkan daftar peserta, 
                  menghitung jumlah mahasiswa, mengubah dosen wali mahasiswa, dan menampilkan data mahasiswa.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package CivitasAkademika;
public class MSeminar {
    public static void main(String[] args) {

        // e. buat dosen
        Dosen d1 = new Dosen("Edy Suharto, S.T., M.Kom", "198009142006041002");
        Dosen d2 = new Dosen("Khadijah, S.Kom., M.Cs.", "198903032015042002");

        // e. buat mahasiswa
        Mahasiswa m1 = new Mahasiswa("Farras Hilmy Zaidan", "24060124120003", d1);
        Mahasiswa m2 = new Mahasiswa("Mulyono", "24060124130073", d1);
        Mahasiswa m3 = new Mahasiswa("Santa Cruz", "24060124141998", d2);
        Mahasiswa m4 = new Mahasiswa("Fufufafa", "24060124120005", d2);
        Mahasiswa m5 = new Mahasiswa("Hitler", "24060124130045", d1);

        // b. seminar
        Seminar s = new Seminar();

        // f. registrasi
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. jumlah peserta
        System.out.println("Total Peserta: " + s.countPeserta());

        // g. tampil peserta
        System.out.println("\nDaftar Peserta");
        System.out.println("----------------------------------------------");
        s.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // i. ubah wali
        m1.setWali(d2);

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa");
        System.out.println("--------------------------------");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}