public class MTitik {
    public static void main (String[] args){
        Titik T1 = new Titik();
        System.out.println("Jumlah Objek Titik = " + Titik.getcounterTitik());
        System.out.println("T1 = (" + T1.getAbsis() + "," + T1.getOrdinat() + ")" );
        Titik T2 = new Titik(5.0, 12.0);
        System.out.println("Jarak Titik T2 ke Titik pusat adalah " +  T2.jarakTitik());
        System.out.println("Jumlah Objek Titik = " + Titik.getcounterTitik());
        T1.setAbsis(2.0);
        T1.setOrdinat(8.0);
        System.out.println("Jarak Titik T1 ke Titik T2 adalah " +  T1.jarakTitik(T2));
        T1.printTitik();
        T1.translasi(3.0, 5.0);
        T1.printTitik();
    }
}
