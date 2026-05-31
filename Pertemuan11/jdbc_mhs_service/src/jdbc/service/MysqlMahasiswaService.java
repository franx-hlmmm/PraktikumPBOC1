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
    private String lastError = "";

    /****************METHOD***************/
    /*************KONSTRUKTOR*************/
    // Konstruktor untuk membuat koneksi ke database MySQL.
    public MysqlMahasiswaService() {
        try {
            koneksi = MysqlUtility.getConnection();
            if (koneksi == null) {
                lastError = MysqlUtility.getLastError();
            }
        } catch (SQLException ex) {
            lastError = "Koneksi database gagal: " + ex.getMessage();
            System.out.println(lastError);
        }
    }

    /*************METHOD LAIN*************/
    // Membuat objek mahasiswa berdasarkan id dan nama.
    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }

    // Menambahkan data mahasiswa ke tabel mahasiswa.
    public boolean add(Mahasiswa mhs) {
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
            return false;
        }

        // Menyiapkan query insert data mahasiswa.
        String sql = mhs.getId() > 0
                ? "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)"
                : "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            if (mhs.getId() > 0) {
                statement.setInt(1, mhs.getId());
                statement.setString(2, mhs.getNama());
            } else {
                statement.setString(1, mhs.getNama());
            }
            statement.executeUpdate();
            statement.close();
            lastError = "";
            return true;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses insert gagal.
            setError("Gagal insert mahasiswa: " + ex.getMessage());
            return false;
        }
    }

    // Mengubah data mahasiswa yang sudah ada pada tabel mahasiswa.
    public boolean update(Mahasiswa mhs) {
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
            return false;
        }

        // Menyiapkan query update nama mahasiswa berdasarkan id.
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, mhs.getNama());
            statement.setInt(2, mhs.getId());
            int rows = statement.executeUpdate();
            statement.close();
            if (rows == 0) {
                setError("Data dengan ID " + mhs.getId() + " tidak ditemukan.");
                return false;
            }
            lastError = "";
            return true;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses update gagal.
            setError("Gagal update mahasiswa: " + ex.getMessage());
            return false;
        }
    }

    // Menghapus data mahasiswa sesuai id.
    public boolean delete(int id) {
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
            return false;
        }

        // Menyiapkan query delete mahasiswa berdasarkan id.
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            statement.close();
            if (rows == 0) {
                setError("Data dengan ID " + id + " tidak ditemukan.");
                return false;
            }
            lastError = "";
            return true;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses delete gagal.
            setError("Gagal delete mahasiswa: " + ex.getMessage());
            return false;
        }
    }

    // Mengambil data mahasiswa sesuai id.
    public Mahasiswa getById(int id) {
        // Mengembalikan null jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
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
            lastError = "";
            return mahasiswa;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses pengambilan data gagal.
            setError("Gagal ambil mahasiswa: " + ex.getMessage());
            return null;
        }
    }

    // Mengambil semua isi tabel mahasiswa.
    public List<Mahasiswa> getAll() {
        // Membuat list untuk menampung seluruh data mahasiswa.
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        // Mengembalikan list kosong jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
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
            lastError = "";
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses pengambilan semua data gagal.
            setError("Gagal ambil semua mahasiswa: " + ex.getMessage());
        }

        return listMahasiswa;
    }

    public boolean indexReset(){
        // Menghentikan proses jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
            return false;
        }

        // Mereset nilai auto-increment tanpa menghapus data.
        String sqlReset = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            PreparedStatement statementReset = koneksi.prepareStatement(sqlReset);
            statementReset.executeUpdate();
            statementReset.close();
            lastError = "";
            return true;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses reset index gagal.
            setError("Gagal reset index: " + ex.getMessage());
            return false;
        }
    }

    public boolean isEmpty(){
        // Mengembalikan true jika koneksi database belum tersedia.
        if (koneksi == null) {
            setError("Koneksi database belum tersedia.");
            return true;
        }

        // Menyiapkan query untuk menghitung jumlah data mahasiswa.
        String sql = "SELECT COUNT(*) AS total FROM mahasiswa";
        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Mengembalikan true jika jumlah data mahasiswa adalah 0.
            boolean isEmpty = false;
            if (resultSet.next()) {
                isEmpty = resultSet.getInt("total") == 0;
            }

            resultSet.close();
            statement.close();
            lastError = "";
            return isEmpty;
        } catch (SQLException ex) {
            // Menampilkan pesan error jika proses pengecekan data gagal.
            setError("Gagal cek apakah tabel kosong: " + ex.getMessage());
            return true;
        }
    }

    public boolean isConnected() {
        return koneksi != null;
    }

    public String getLastError() {
        return lastError;
    }

    private void setError(String message) {
        lastError = message;
        System.out.println(message);
    }

    public void closeConnection() {
        // Menutup koneksi database jika masih terbuka.
        if (koneksi != null) {
            try {
                koneksi.close();
            } catch (SQLException ex) {
                System.out.println("Gagal menutup koneksi: " + ex.getMessage());
            }
        }
    }
}