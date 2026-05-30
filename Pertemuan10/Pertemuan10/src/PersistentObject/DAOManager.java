/* Nama File    : DAOManager.java
 * Deskripsi    : Pengelola DAO dalam program
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
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
    
}
