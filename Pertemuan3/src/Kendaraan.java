public class Kendaraan {
    /***ATRIBUT***/
    private String noPlat;
    private String jenis;
    private static int countKendaraan; 

    /***METHOD***/
    public Kendaraan() {
        this("Kosong", "Kosong");
        countKendaraan++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

    public Kendaraan(String noPlat, String jenis) {
        if(jenis.equals("motor") || jenis.equals("mobil")){
            this.noPlat = noPlat;
            this.jenis = jenis;
            countKendaraan++;
        }
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public static int getCountKendaraan(){
        return Kendaraan.countKendaraan;
    }

    public static void printCountKendaraan(){
        System.out.println("Jumlah Kendaraan : " + Kendaraan.getCountKendaraan());
    }

    public void printKendaraan() {
        System.out.println("No Plat: " + noPlat + ", Jenis: " + jenis);
    }
}