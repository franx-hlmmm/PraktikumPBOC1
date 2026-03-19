/* Nama File    : MPegawai.java
 * Deskripsi    : berisi main program untuk menguji class Pegawai dan turunannya
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 19 Maret 2026
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        System.out.println("=========== DOSEN TETAP ===========");

        DosenTetap DT1 = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1980, 5, 5),
            LocalDate.of(2015, 1, 1),
            5000000,
            "Fakultas Sains dan Matematika",
            "78647324"
        );
        DT1.printInfo();
        System.out.println();

        DosenTetap DT2 = new DosenTetap(
            "197505052000121002",
            "Siti Aminah",
            LocalDate.of(1975, 5, 5),
            LocalDate.of(2000, 12, 1),
            7000000,
            "Fakultas Teknik",
            "00445566"
        );
        DT2.printInfo();
        System.out.println();

        DosenTetap.printCounterDosenTetap();
        System.out.println();

        

        System.out.println("=========== DOSEN TAMU ===========");

        DosenTamu DTamu1 = new DosenTamu(
            "199001012020011001",
            "Andi Wijaya",
            LocalDate.of(1990, 1, 1),
            LocalDate.of(2020, 1, 1),
            4000000,
            "Fakultas Sains dan Matematika",
            "77889900",
            LocalDate.of(2026, 12, 31)
        );
        DTamu1.printInfo();
        System.out.println();

        DosenTamu DTamu2 = new DosenTamu(
            "198512122018021002",
            "Rina Kartika",
            LocalDate.of(1985, 12, 12),
            LocalDate.of(2018, 2, 1),
            4500000,
            "Fakultas Ekonomika dan Bisnis",
            "22334455",
            LocalDate.of(2027, 6, 30)
        );
        DTamu2.printInfo();
        System.out.println();

        DosenTamu.printCounterDosenTamu();
        System.out.println();

        System.out.println("=========== TENDIK ===========");

        Tendik T1 = new Tendik(
            "197001011990011001",
            "Agus Saputra",
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1990, 1, 1),
            3000000,
            "Administrasi"
        );
        T1.printInfo();
        System.out.println();

        Tendik T2 = new Tendik(
            "198203152010031002",
            "Dewi Lestari",
            LocalDate.of(1982, 3, 15),
            LocalDate.of(2010, 3, 1),
            3500000,
            "Keuangan"
        );
        T2.printInfo();
        System.out.println();

        Tendik.printCounterTendik();
        System.out.println();

        System.out.println("=========== TOTAL PEGAWAI ===========");
        Pegawai.printCounterPegawai();
    }
}