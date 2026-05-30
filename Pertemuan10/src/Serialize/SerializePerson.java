/* Nama File    : SerializePerson.java
 * Deskripsi    : Program untuk serialisasi objek Person
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 14 Mei 2026
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Serialize;
import java.io.*;

//class Person
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
/**
 *
 * @author Farras Hilmy Zaidan
 */
public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("Edy");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
