/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 14 Mei 2026
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Farras Hilmy Zaidan
 */
public class Mahasiswa {
    /***************ATRIBUT***************/
    private int id;
    private String nama;
    
    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor tanpa parameter untuk menginisialisasi data default mahasiswa.
    public Mahasiswa() {
        this.id = -1;
        this.nama = "";
    }

    // Konstruktor dengan parameter id dan nama untuk menginisialisasi data mahasiswa.
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**************SELEKTOR**************/
    // Mengembalikan id mahasiswa.
    public int getId() {
        return id;
    }

    /***************MUTATOR***************/
    // Mengubah id mahasiswa sesuai input.
    public void setId(int id) {
        this.id = id;
    }

    /**************SELEKTOR**************/
    // Mengembalikan nama mahasiswa.
    public String getNama() {
        return nama;
    }

    /***************MUTATOR***************/
    // Mengubah nama mahasiswa sesuai input.
    public void setNama(String nama) {
        this.nama = nama;
    }

    /*************METHOD LAIN*************/
    // Mengembalikan informasi mahasiswa dalam bentuk string.
    @Override
    public String toString(){
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + "}";
    }
}