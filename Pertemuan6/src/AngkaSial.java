/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri pengenalan throw and throws
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 14 April 2026
 */
public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 * Baris 12, System.out.println(angka + " bukan angka sial");, akan dieksekusi jika angka
 * yang dimasukkan bukan 13. Baris 21, catch (AngkaSialException ase), akan dieksekusi jika
 * angka yang dimasukkan adalah 13. getMessage() akan mengembalikan pesan yang sudah
 * didefinisikan pada kelas Exception, serta akan menampilkan output "hati-hati dalam
 * memasukan angka!!!".
 * 
 * Hal ini terjadi karena pada blok try terdapat pemanggilan as.cobaAngka(13);, yang akan
 * memanggil method cobaAngka(). Method cobaAngka() ini akan melempar exception
 * AngkaSialException() jika angka yang dimasukkan adalah 13, sehingga program akan
 * menangkap exception tersebut dan menampilkan pesan yang sudah didefinisikan. Lalu baris
 * kode pada blok catch akan dieksekusi.
 * 
 * Baris dengan kode as.cobaAngka(12); tidak akan dieksekusi , karena baris kode sebelumnya yakni
 * angka 13 memicu eksepsi, sehingga program akan langsung mengeksekusi blok catch dan
 * berhenti pada baris kode tersebut. Sehingga, output yang dihasilkan ketika program dijalankan
 * adalah:
 * 10 bukan angka sial
 * jangan memasukkan angka 13 karena angka sial!!!
 * hati-hati dalam memasukkan angka!!!
*/