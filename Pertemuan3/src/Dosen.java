public class Dosen {
    /***ATRIBUT***/
    private String nip; /***Nomor Induk Pegawai***/
    private String nama; /***Nama Dosen***/
    private String prodi; /***Program Studi***/
    private static int countDosen; /***Menghitung banyaknya data Dosen yang telah di konstruksi***/

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Dosen() {
        this("0", "Default", "Belum");
        countDosen++;
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        countDosen++; 
    }

    /***SELEKTOR***/
    public String getNIP(){ 
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    /***MUTATOR***/
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String nip){ 
        this.nip = nip;
    }

    public void setProdi(String prodi){ 
        this.prodi = prodi;
    }

    /***OPERATOR TAMBAHAN***/
    /***MENGHITUNG JUMLAH DOSEN***/
    public static int getCountDosen(){
        return Dosen.countDosen;
    }
    /***MENAMPILKAN JUMLAH DOSEN***/
    public static void printCountDosen(){
        System.out.println("Jumlah Dosen : " + Dosen.getCountDosen());
    }
    /***MENAMPILKAN IDENTITAS DOSEN***/
    public void printDosen(){
        System.out.println("NIP = " + nip + ", Nama = " + nama + ", Prodi = " + prodi);
    }
}