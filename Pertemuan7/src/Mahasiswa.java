public class Mahasiswa {
    /***ATRIBUT***/
    private String NIM;
    private String Nama;
    private String Prodi;
    /***METHOD***/
    // c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Prodi = "n/a";
    }
    // d. Konstruktor dengan 3 parameter
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }
    // e. Konstruktor Kloning
    public Mahasiswa(Mahasiswa M) {
        this.NIM = M.NIM;
        this.Nama = M.Nama;
        this.Prodi = M.Prodi;
    }

    // tanpa parameter
    public void setProdi() {
        this.Prodi = "kosong";
    }

    // dengan parameter string prodi
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    // dengan kloning/copy mahasiswa
    public void setProdi(Mahasiswa M) {
        this.Prodi = M.Prodi;
    }    

    // cetak info Mahasiswa
    public void cetak() {
        System.out.println("NIM     : " + NIM);
        System.out.println("Nama    : " + Nama);
        System.out.println("Prodi   : " + Prodi);
        System.out.println("--------------------------------------------");
    }
}
