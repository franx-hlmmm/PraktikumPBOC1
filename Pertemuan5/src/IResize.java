/* Nama File    : IResize.java
 * Deskripsi    : berisi method dalam interface IResize untuk mengubah ukuran
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Maret 2026
*/

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();
    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();
    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
