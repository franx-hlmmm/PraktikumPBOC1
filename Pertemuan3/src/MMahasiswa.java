public class MMahasiswa {
    public static void main(String[] args) {
        /***MATA KULIAH***/
        MataKuliah ASA = new MataKuliah();
        System.out.println("------------ MATA KULIAH ------------");
        ASA.printMatkul();

        ASA.setID("MIK1624404");
        ASA.setNama("Analisis dan Strategi Algoritma");
        ASA.setSKS(3);
        ASA.printMatkul();

        MataKuliah IMK = new MataKuliah();
        IMK.setID("MIK1624603");
        IMK.setNama("Interaksi Manusia dan Komputer");
        IMK.setSKS(3);
        IMK.printMatkul();

        MataKuliah Alpro = new MataKuliah();
        Alpro.setID("MIK1624202");
        Alpro.setNama("Algoritma Pemrograman");
        Alpro.setSKS(4);
        Alpro.printMatkul();
        System.out.println(" ");
        System.out.println("Total Mata Kuliah: " + MataKuliah.getCountMatkul());
        System.out.println(" ");

        /***DOSEN***/
        System.out.println("------------ DOSEN ------------");
        Dosen D1 = new Dosen();
        D1.printDosen();
        D1.setNIP("24060124120026");
        D1.setNama("Prabowo");
        D1.setProdi("Ilmu Nyawit");
        D1.printDosen();
        System.out.println(" ");

        Dosen D2 = new Dosen();
        D2.setNIP("24060124120004");
        D2.setNama("Jokowi");
        D2.setProdi("Ilmu Nganggur");
        D2.printDosen();
        System.out.println(" ");

        System.out.println("Total Dosen: " + Dosen.getCountDosen());
        System.out.println(" ");

        /***KENDARAAN***/
        System.out.println("------------ KENDARAAN ------------");
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("H 4974 TH");
        K1.setJenis("Mobil");
        K1.printKendaraan();
        System.out.println(" ");

        Kendaraan K2 = new Kendaraan();
        K2.setNoPlat("H 8105 U");
        K2.setJenis("Motor");
        K2.printKendaraan();
        System.out.println(" ");

        System.out.println("Total Kendaraan: " + Kendaraan.getCountKendaraan());
        System.out.println(" ");

        /***MAHASISWA***/
        System.out.println("------------ MAHASISWA ------------");
        Mahasiswa M1 = new Mahasiswa("24060124120003", "Farras Hilmy Zaidan", "Informatika");
        M1.addMatkul(Alpro);
        M1.addMatkul(ASA);
        M1.addMatkul(IMK);
        M1.setDosen(D1);
        M1.setKendaraan(K1);
        M1.printDetailMhs();
        System.out.println(" ");

        Mahasiswa M2 = new Mahasiswa("24060124130063", "Akbar Mukti Wibowo", "Informatika");
        M2.addMatkul(ASA);
        M2.addMatkul(IMK);
        M2.setDosen(D2);
        M2.setKendaraan(K2);
        M2.printDetailMhs();
        System.out.println(" ");

        System.out.println("Total Mahasiswa: " + Mahasiswa.getJmlMhs());
    }
}
