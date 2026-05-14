/* Nama File    : Data.java
 * Deskripsi    : Kelas generik Data dengan ArrayList berisi 100 elemen (posisi 1..100), beserta getIsi, setIsi, dan getSize.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 1 Mei 2026
 */

import java.util.ArrayList;

public class Data<T> {
    private ArrayList<T> ruang;
    private int banyak;

    public Data() {
        this.ruang = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            this.ruang.add(null);
        }
        this.banyak = 0;
    }

    private int toIndex(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IndexOutOfBoundsException("input posisi harus dalam rentang 1..100");
        }
        return posisi - 1;
    }

    public T getIsi(int posisi) {
        return ruang.get(toIndex(posisi));
    }

    public void setIsi(int posisi, T isi) {
        int index = toIndex(posisi);
        if (ruang.get(index) == null) {
            banyak++;
        }
        ruang.set(index, isi);
    }

    public int getSize() {
        return banyak;
    }
}