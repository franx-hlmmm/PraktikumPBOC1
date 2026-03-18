public class Lingkaran extends BangunDatar{
    /***ATRIBUT***/
    private double jari;
    private static int counterLingkaran;
    /***METHOD***/
    /***KONSTRUKTOR***/
    public Lingkaran() {
        setJmlSisi(1);
    }
    public Lingkaran(double jari,String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }
    /***SELEKTOR***/
    public double getJari() {
        return jari;
    }
    /***MUTATOR***/
    public void setJari(double jari) {
        this.jari = jari;
    }
    /***OPERATOR TAMBAHAN***/
    public double getLuas() {
        return Math.PI*jari*jari;
    }
    public double getKeliling() {
        return Math.PI*2*jari;
    }
    public double getDiameter() {
        return 2*jari;
    }
    public static int getCounterLingkaran() {
        return Lingkaran.counterLingkaran;
    }
    public static void printCounterLingkaran() {
        System.out.println("Jumlah Objek Lingkaran: " + Lingkaran.getCounterLingkaran());
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jari - jari: " + jari);
    }
}
