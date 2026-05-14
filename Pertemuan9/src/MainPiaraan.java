/* Nama File    : MainPiaraan.java
 * Deskripsi    : Kelas aplikasi untuk menguji seluruh operasi pada kelas Piaraan.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 7 Mei 2026
 */

public class MainPiaraan {
	public static void main(String[] args) {
		// Kamus
		Piaraan P;
		Kucing K1;
		Anggora K2;
		Kembangtelon K3;
		Anjing A1;
		Burung B1;

		// Algoritma
        System.out.println("\t APLIKASI KOLEKSI PADA ANABUL PIARAAN \t");
		P = new Piaraan();
		K1 = new Kucing("Kucing1", 4.2);
		K2 = new Anggora("Anggora1", 3.1);
		K3 = new Kembangtelon("Kembangtelon1", 3.7);
		A1 = new Anjing("Anjing1");
		B1 = new Burung("Burung1");

		K1.setPanggilan("Neko");
		K2.setPanggilan("Cimol");
		K3.setPanggilan("Coco");
		A1.setPanggilan("Lo Siento");
		B1.setPanggilan("Parrot");

		System.out.println("Dulu aku memiliki " + P.getNbelm() + " ekor piaraan");

		P.enqueueAnabul(K1);
		P.enqueueAnabul(K2);
		P.enqueueAnabul(K3);
		P.enqueueAnabul(A1);
		P.enqueueAnabul(B1);

		System.out.println("Aku memiliki " + P.getNbelm() + " Anabul Piaraan Sekarang");
		System.out.println("dengan List Nama Panggilan Anabul seperti dibawah ini : ");
		P.showAnabul();

		System.out.println("\nIni Anabul pertamaku namanya " + P.getAnabul().getPanggilan() + " dan dia seekor " + P.getAnabul().getClass().getSimpleName());
		System.out.println("Apakah 'Neko' ada dalam antrean : " + P.isMember(K1));

		System.out.println("\nCount Keluarga Kucing : " + P.countKucing());
		System.out.println("Total Bobot Keluarga Kucing : " + P.bobotKucing() + "kg");

		System.out.println("\nBerikut adalah jenis tiap Anabul yang kumiliki : ");
		P.showJenisAnabul();

		System.out.println("\nAnabulku yang bernama " + P.dequeueAnabul().getPanggilan() + " mati hari ini, aku melakukan dequeue pada antrian");
		System.out.println("NBElement Setelah Dequeue : " + P.getNbelm());

		System.out.println("\nSeluruh Anabul setelah dequeue : ");
		P.showAnabul();
	}
}