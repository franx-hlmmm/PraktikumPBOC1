/* Nama File    : DiskonLambda.java
 * Deskripsi    : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 28 Mei 2026
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // Dengan Lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        IDiskon diskonBertingkat = (harga) -> {
            if (harga >= 100000) {
                return harga - (harga * 0.3);   // diskon 30% untuk harga ≥ 100rb
            } else if (harga >= 50000) {
                return harga - (harga * 0.15);  // diskon 15% untuk harga ≥ 50rb
            } else {
                return harga;                   // tidak ada diskon
            }
        };

        // Menampilkan hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));
    }
}