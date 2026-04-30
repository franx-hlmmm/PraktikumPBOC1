/* Nama File    : MAnabul.java
 * Deskripsi    : Membuat class Main untuk menguji konsep polimorfisme universal inclusion dengan membuat array dari 
                  tipe Anabul yang berisi objek-objek dari kelas Kucing, Anjing, dan Burung. Kemudian, menggunakan loop 
                  untuk memanggil method gerak dan bersuara pada setiap objek dalam array, sehingga menunjukkan perilaku 
                  yang berbeda sesuai dengan jenis hewan peliharaan yang diwakili oleh masing-masing objek.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 23 April 2026
 */

package Anabul;
public class MAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Kucing Anggora");
        Anabul a2 = new Anjing("Anjing Chihuahua");
        Anabul a3 = new Burung("Burung Kenari");

        // Anabul 1
        System.out.println("Anabul 1: ");
        a1.Gerak();
        a1.Bersuara();
        System.out.println();

        // Anabul 2
        System.out.println("Anabul 2: ");
        a2.Gerak();
        a2.Bersuara();
        System.out.println();

        // Anabul 3
        System.out.println("Anabul 3: ");
        a3.Gerak();
        a3.Bersuara();
        System.out.println();
    }
}
