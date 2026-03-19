import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /***ATRIBUT***/
    private String NIDN; // Nomor Induk Dosen Nasional
    private final int BUP = 65; // pake final karena nilai Batas Usia Pensiun tidak berubah pada setiap Dosen Tetap dan tidak berubah waktu perhitungan
    private static int counterDosenTetap = 0; // atribut static untuk menghitung dosen tetap yang terdaftar
    /***METHOD***/
    /***KONSTRUKTOR***/
    // Konstruktor tanpa parameter
    public DosenTetap() {
        super();
        counterDosenTetap++;
    }
    // Konstruktor dengan parameter
    public DosenTetap(String NIP, String Nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, Nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
        counterDosenTetap++;
    }
    /***SELEKTOR***/
    // mengembalikan NIDN dosen tetap
    public String getNIDN() {
        return NIDN;
    }
    /***MUTATOR***/
    // mengubah NIDN dosen tetap
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    /***OPERATOR TAMBAHAN***/
    // mengembalikan nilai tunjangan dengan rumus 2% * masa kerja * gajipokok
    public double getTunjangan() {
        // Kamus Lokal
        int tahun;
        // Algoritma
        tahun = Period.between(TMT, LocalDate.now()).getYears(); // mengambil tahunnya aja dari masa kerja
        return 0.02 * tahun * gajiPokok;
    }
    // mengembalikan tanggal pensiun seorang dosen tetap yakni 65 tahun setelah tanggal lahir di bulan berikutnya pada tanggal 1
    public LocalDate getTanggalPensiun() {
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1); // plusyear buat nambahin tahun nya, plusmonth nambahin bulan, with day of month ngasih tahu tanggal berapa pada bulan itu
    }
    // mengembalikan banyaknya dosen tetap yang telah terdaftar pada sistem
    public static int getCounterDosenTetap() {
        return counterDosenTetap;
    }
    // menampilkan banyaknya dosen tetap yang telah terdaftarpada sistem
    public static void printCounterDosenTetap() {
        System.out.println("Jumlah dosen tetap yang terdaftar adalah " + getCounterDosenTetap() + " orang");
    }
    // menampilkan info lengkap seornag dosen tetap
    @Override
    public void printInfo() {
        super.printNIP();
        System.out.println("NIDN            : " + getNIDN());
        super.printInfoSederhana();
        System.out.println("Jabatan         : Dosen tetap");
        System.out.println("Fakultas        : " + getFakultas());
        super.printMasaKerja();
        System.out.println("Tanggal Pensiun : " + formatTanggal(this.getTanggalPensiun()));
        super.printGajiPokok();
        System.out.println("Tunjangan       : 2% x "+ getTahunKerja() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}
