/* Nama File    : Person.java
 * Deskripsi    : Person database model
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
public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
