public class overloadingMain {
    public static void main(String[] args) {
        System.out.println("============ APLIKASI MAHASISWA ============");

        // c. Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1 : ");
        m1.cetak();

        // d. Konstruktor dengan tiga paramaeter
        Mahasiswa m2 = new Mahasiswa("24060124120003", "Farras Hilmy Zaidan", "S1 Informatika");
        System.out.println("Mahasiswa 2 : ");
        m2.cetak();

        // e. Konstruktor kloning mhs
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3 : ");
        m3.cetak();

        // setProdi
        System.out.println("========== OVERLOADING SET PRODI ===========");
        // Tanpa Parameter
        System.out.println("ubah prodi m1 tanpa parameter");
        m1.setProdi();
        m1.cetak();
        // Dengan parameter
        System.out.println("Ubah Prodi m2 dengan parameter String");
        m2.setProdi("Teknik Nyawit");
        m2.cetak();
        // kloning mhs
        System.out.println("Ubah Prodi m1 dengan kloning mahasiswa m2");
        m1.setProdi(m2);
        m1.cetak();
    }
}
