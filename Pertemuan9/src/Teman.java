/* Nama File    : Teman.java
 * Deskripsi    : Kelas untuk mengelola koleksi objek generik
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 7 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /***ATRIBUT***/
    private int nbelm;
    private List<String> Lnama;
    
    /***KONSTRUKTOR***/
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    //Method function untuk mengakses jumlah teman
    public int getNbelm() {
        return nbelm;
    }

    //Method function untuk mengakses dan memodifikasi nama teman
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    //method function untuk mengganti nama dengan indeks yang diinginkan
    public void setNama(int indeks, String nama){
        if(indeks>=0 && indeks<nbelm){
            Lnama.set(indeks, nama);
        }
    }

    //method function untuk menambah nama ke daftar teman dengan posisi paling terakhir
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    //method function untuk mendelete nama ke daftar teman
    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm--;
    }

    //Method function untuk menambahkan, menghapus, memeriksa keanggotaan,
    //mengganti nama, menghitung jumlah nama, dan menampilkan daftar teman
    public boolean isMember (String nama) {
        return Lnama.contains(nama);
    }

    //Method function untuk menambahkan, menghapus, memeriksa keanggotaan,
    //mengganti nama, menghitung jumlah nama, dan menampilkan daftar teman
    public void gantiNama(String nama, String namaBaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
        }
    }
    
    //Method function untuk menambahkan, menghapus, memeriksa keanggotaan,
    //mengganti nama, menghitung jumlah nama, dan menampilkan daftar teman
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    //Method function untuk menambahkan, menghapus, memeriksa keanggotaan,
    //mengganti nama, menghitung jumlah nama, dan menampilkan daftar teman
    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}
