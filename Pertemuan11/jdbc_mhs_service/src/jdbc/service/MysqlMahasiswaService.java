/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author Farras Hilmy Zaidan
 */

public class MysqlMahasiswaService {
    /***************ATRIBUT***************/
    Connection koneksi = null;

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk membuat koneksi ke database MySQL.
    public MysqlMahasiswaService(){
        try {
            koneksi = MysqlUtility.getConnection();
        } catch (SQLException ex) {
            System.out.println("Koneksi database gagal: " + ex.getMessage());
        }
    }

    /*************METHOD LAIN*************/
    // Membuat objek mahasiswa berdasarkan id dan nama.
    public Mahasiswa makeMhsObject(int id, String nama){
        return new Mahasiswa(id, nama);
    }

    // Menambahkan data mahasiswa ke tabel mahasiswa.
    public void add (Mahasiswa mhs){
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            return;
        }

        // Menyiapkan query insert data mahasiswa.
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, mhs.getId());
            statement.setString(2, mhs.getNama());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses insert gagal.
            System.out.println("Gagal insert mahasiswa: " + ex.getMessage());
        }
    }

    // Mengubah data mahasiswa yang sudah ada pada tabel mahasiswa.
    public void update (Mahasiswa mhs){
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            return;
        }

        // Menyiapkan query update nama mahasiswa berdasarkan id.
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, mhs.getNama());
            statement.setInt(2, mhs.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses update gagal.
            System.out.println("Gagal update mahasiswa: " + ex.getMessage());
        }
    }

    // Menghapus data mahasiswa sesuai id.
    public void delete(int id){
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            return;
        }

        // Menyiapkan query delete mahasiswa berdasarkan id.
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses delete gagal.
            System.out.println("Gagal delete mahasiswa: " + ex.getMessage());
        }
    }

    // Mengambil data mahasiswa sesuai id.
    public Mahasiswa getById(int id){
        // Mengembalikan null jika koneksi database belum tersedia.
        if (koneksi == null) {
            return null;
        }

        // Menyiapkan query select mahasiswa berdasarkan id.
        String sql = "SELECT id, nama FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            // Membuat objek mahasiswa jika data ditemukan.
            Mahasiswa mahasiswa = null;
            if (resultSet.next()) {
                mahasiswa = new Mahasiswa(
                        resultSet.getInt("id"),
                        resultSet.getString("nama")
                );
            }

            resultSet.close();
            statement.close();
            return mahasiswa;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses pengambilan data gagal.
            System.out.println("Gagal ambil mahasiswa: " + ex.getMessage());
            return null;
        }
    }

    // Mengambil semua isi tabel mahasiswa.
    public List<Mahasiswa> getAll (){
        // Membuat list untuk menampung seluruh data mahasiswa.
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        // Mengembalikan list kosong jika koneksi database belum tersedia.
        if (koneksi == null) {
            return listMahasiswa;
        }

        // Menyiapkan query select semua data mahasiswa.
        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Menambahkan setiap data hasil query ke dalam list.
            while (resultSet.next()) {
                Mahasiswa mahasiswa = new Mahasiswa(
                        resultSet.getInt("id"),
                        resultSet.getString("nama")
                );
                listMahasiswa.add(mahasiswa);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses pengambilan semua data gagal.
            System.out.println("Gagal ambil semua mahasiswa: " + ex.getMessage());
        }

        return listMahasiswa;
    }
}
