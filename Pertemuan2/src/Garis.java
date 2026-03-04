/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Februari 2026
*/

public class Garis {
    /****ATRIBUT****/
    private Titik TitikAwal;
    private Titik TitikAkhir;
    private static int counterGaris = 0;
    /****METHOD****/
    //Konstruktor
    //Konstruktor Garis((0,0),(1,1))
    public Garis(){
        TitikAwal = new Titik(0.0, 0.0);
        TitikAkhir = new Titik(1.0, 1.0);
        counterGaris++;
    }
    //Konstruktor Garis(T1, T2)
    public Garis(Titik T1, Titik T2){
        TitikAwal = T1;
        TitikAkhir = T2;
        counterGaris++;
    }

    //Selektor
    public Titik getTitikAwal(){
        return TitikAwal;
    }
    public Titik getTitikAkhir(){
        return TitikAkhir;
    }
    public static int getcounterTitikounterGaris(){
        return counterGaris;
    }

    //Mutator
    public void setTitikAwal(Titik T){
        TitikAwal = T;
    }
    public void setTitikAwal(double x, double y){
        TitikAwal.setAbsis(x);
        TitikAwal.setOrdinat(y);
    }
    public void setTitikAkhir(Titik T){
        TitikAkhir = T;
    }
    public void setTitikAkhir(double x, double y){
        TitikAkhir.setAbsis(x);
        TitikAkhir.setOrdinat(y);
    }
    //Operator Tambahan
    public double getPanjang(){
        return TitikAkhir.getJarak(TitikAwal);
    }
    public double getGradien(){
        return (TitikAkhir.getOrdinat()-TitikAwal.getOrdinat())/(TitikAkhir.getAbsis()-TitikAwal.getAbsis());  
    }
    public Titik getTitikTengah(){
        //Kamus Lokal
        Titik T1 = new Titik();
        //Algoritma
        T1.setAbsis(TitikAwal.getAbsis()+((TitikAkhir.getAbsis()-TitikAwal.getAbsis())/2));
        T1.setOrdinat(TitikAwal.getOrdinat()+((TitikAkhir.getOrdinat()-TitikAwal.getOrdinat())/2));
        return T1;
    }
    public boolean isSejajar(Garis G1){
        return G1.getGradien()==this.getGradien();
    }
    public boolean isTegakLurus(Garis G1){
        return G1.getGradien()==-(1/this.getGradien());
    }
    public void printGaris(){
        System.out.println("("+TitikAwal.getAbsis()+","+TitikAwal.getOrdinat()+"), ("+TitikAkhir.getAbsis()+","+TitikAkhir.getOrdinat()+")");
    }
    public void printPersamaan(){
        System.out.println("y = "+this.getGradien()+"x + "+(TitikAwal.getOrdinat()-this.getGradien()*TitikAwal.getAbsis()));
    }
    public void printCounterGaris(){
        System.out.println("Banyaknya objek garis = "+this.counterGaris);
    }
}
