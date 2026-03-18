/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 11 Mareet 2026
*/

public class Persegi extends BangunDatar{
    /***ATRIBUT***/
    private double sisi;
    private static int counterPersegi;
    /***METHOD***/
    /***KONSTRUKTOR***/
    public Persegi() {
        setJmlSisi(4);
    }
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
        counterPersegi++;
    }
    /***SELEKTOR***/
    public double getSisi() {
        return sisi;
    }
    /***MUTATOR***/
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    /***OPERATOR TAMBAHAN***/
    public double getLuas () {
        return sisi*sisi;
    }
    public double getKeliling() {
        return sisi*4;
    }
    public double getDiagonal() {
        return Math.sqrt(sisi*sisi + sisi*sisi);
    }
    public static int getCounterPersegi() {
        return Persegi.counterPersegi;
    }
    public static void printJmlPersegi() {
        System.out.println("Jumlah Objek Persegi: " + Persegi.getCounterPersegi());  
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
