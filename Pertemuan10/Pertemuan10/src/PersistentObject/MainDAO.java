/* Nama File    : MainDAO.java
 * Deskripsi    : Main Program Untuk Akses DAO
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 14 Mei 2026
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistentObject;

/**
 *
 * @author Farras Hilmy Zaidan
 */
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Edy");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
