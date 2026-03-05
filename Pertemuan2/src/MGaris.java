/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Februari 2026
*/

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        G1.printCounterGaris();
        G1.printGaris();
        Titik TAwal = new Titik(-2.0, 0.0);
        Titik TAkhir = new Titik(0.0, 4.0);
        Garis G2 = new Garis(TAwal, TAkhir);
        G2.printCounterGaris();
        G1.printCounterGaris();
        G2.printGaris();
        G1.setTitikAwal(-3.0,0.0);
        Titik T1 = new Titik();
        T1.setOrdinat(6.0);
        G1.setTitikAkhir(T1);
        G1.printGaris();
        Garis G3 = new Garis();
        G3.printCounterGaris();
        G3.setTitikAwal(2.0, 3.0);
        G3.setTitikAkhir(4.0, 2.0);
        System.out.println("Panjang garis G1 adalah "+G1.getPanjang()+" satuan");
        System.out.println("Gradien garis G3 adalah "+G3.getGradien());
        System.out.println("Titik Tengah garis G2 adalah ");
        G1.getTitikTengah().printTitik();
        System.out.println("Apakah G1 Sejajar dengan G2? "+G1.isSejajar(G2));
        System.out.println("Apakah G1 Tegak Lurus dengan G3? "+G1.isTegakLurus(G3));
        G3.printPersamaan();
    }
}
