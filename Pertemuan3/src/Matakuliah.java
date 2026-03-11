public class MataKuliah {
    /***ATRIBUT***/
    private String idMatkul;
    private String nama;
    private int sks;
    private static int counterMatkul = 0;

    /***METHOD***/
    public MataKuliah(){
        this("0", "null", 0);
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getID(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    public void setID(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    public static int getCountMatkul(){
        return MataKuliah.counterMatkul;
    }

    public static void printCountMatkul(){
        System.out.println("Jumlah Dosen : " + MataKuliah.getCountMatkul());
    }

    public void printMatkul(){
        System.out.println("ID Matkul = " + idMatkul + ", Nama = " + nama + ", SKS = " + sks);
    }
}