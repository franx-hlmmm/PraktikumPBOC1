/* Nama File    : MySQLPersonDAO.java
 * Deskripsi    : Implementasi Person DAO untuk MySQL
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 14 Mei 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistentObject;
import java.sql.*;
/**
 *
 * @author Farras Hilmy Zaidan
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
         String name = person.getName();
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/pbo", "root", "!U20n06D04i24P!");
         String query = "INSERT INTO person(name) VALUES ('"+name+"')";
         System.out.println(query);
         Statement s = con.createStatement();
         s.executeUpdate(query);
         con.close();
    }
}