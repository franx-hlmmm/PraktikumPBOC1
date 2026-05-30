/* Nama File    : MysqlUtility.java
 * Deskripsi    : berisi utility untuk membuat koneksi database MySQL
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 14 Mei 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Farras Hilmy Zaidan
 */

public class MysqlUtility {
    /***************ATRIBUT***************/
    private static Connection koneksi;

    /****************METHOD***************/
    /*************METHOD LAIN*************/
    // Mengembalikan koneksi database MySQL.
    public static Connection getConnection() throws SQLException {
        // Membuat koneksi baru jika koneksi belum ada atau sudah tertutup.
        if (koneksi == null || koneksi.isClosed()) {
            try {
                // Memuat driver MySQL.
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Menentukan url, user, dan password database.
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "!U20n06D04i24P!";

                // Membuat koneksi ke database.
                koneksi = DriverManager.getConnection(url, user, password);

                // Menampilkan pesan jika koneksi berhasil dibuat.
                if(koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                // Menampilkan pesan error jika driver MySQL gagal dimuat.
                System.out.println("Gagal load driver :" + cne.getMessage());
            } catch (SQLException sqle){
                // Menampilkan pesan error jika koneksi database gagal.
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}