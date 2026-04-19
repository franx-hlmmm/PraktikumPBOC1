/**
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 14 April 2026
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}