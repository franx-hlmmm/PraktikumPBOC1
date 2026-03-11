import java.util.ArrayList;

public class Mahasiswa {
    /***ATRIBUT***/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> ListMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int countMahasiswa = 0;

    /***METHOD***/
    /***KONSTRUKTOR***/
    public Mahasiswa(){
        nim = " ";
        nama = " ";
        prodi = " ";
        ListMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        countMahasiswa++;
    }
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        ListMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        countMahasiswa++;
    }
    /***SELEKTOR***/
    public String getNIM(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
    public String getProdi(){
        return this.prodi;
    }
    public int getJumlahSKS(){
        int i;
        int totalSKS = 0;
        for(i = 0; i < ListMatkul.size(); i++){
            totalSKS += ListMatkul.get(i).getSKS();
        }
        return totalSKS;
    }
    public int getJumlahMatkul(){
        int i;
        int totalMatkul = 0;
        for(i = 0; i < ListMatkul.size(); i++){
            totalMatkul += 1;
        }
        return totalMatkul;
    }
    /***MUTATOR***/
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setName(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void addMatkul(MataKuliah newMatkul){
        if (ListMatkul.size() < 50){
            ListMatkul.add(newMatkul);
        }
    }
    public void setDosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    /***OPERATOR TAMBAHAN***/
    public void printMhs(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
    }
    public void printDetailMhs(){
        int i;
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("List Matkul : ");
        for (i=0; i<ListMatkul.size(); i++){
            System.out.println("   " + (i+1) + ". " + ListMatkul.get(i).getNama() + " (" + ListMatkul.get(i).getSKS() + " SKS)");
        }
        System.out.println("Total SKS: " + this.getJumlahSKS());
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali: " + dosenWali.getNIP());
        System.out.println("No. Plat Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan : " + kendaraan.getJenis());
    }
    public static int getJmlMhs(){
        return Mahasiswa.countMahasiswa;
    }
    public static void printJmlMhs(){
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getJmlMhs());
    }
}
