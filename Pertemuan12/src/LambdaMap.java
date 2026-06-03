/* Nama File    : LambdaMap.java
 * Deskripsi    : Program main yang digunakan untuk menampilkan nama-nama mahasiswa dari Map
                  menggunakan ekspresi lambda.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 28 Mei 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123120001", "Adi");
        mahasiswaMap.put("24060123120002", "Bambang");
        mahasiswaMap.put("24060123120003", "Cici");
        mahasiswaMap.put("24060123120004", "Didi");

        // Menggunakan lambda untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}