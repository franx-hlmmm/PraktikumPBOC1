/* Nama File    : MainTeman.java
 * Deskripsi    : Kelas untuk run koleksi objek teman
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 7 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Prabowo");
        teman.addNama("Mulyono");
        teman.addNama("Fufufafa");
        teman.addNama("Prabowo");
        
        System.out.println("Daftar Teman:");
        teman.showTeman();
        System.out.println("\nApakah Prabowo adalah teman anda? " + (teman.isMember("Prabowo")? "Ya":"Tidak"));
        
        teman.gantiNama("Fufufafa", "Gibran");
        System.out.println("\nDaftar Teman setelah mengganti nama Fufufafa menjadi Gibran (kayaknya):");
        teman.showTeman();
        
        teman.delNama("Mulyono");
        System.out.println("\nDaftar Teman setelah marahan sama Mulyono:");
        teman.showTeman();
        
        System.out.println("\nJumlah nama Prabowo: " + teman.countNama("Prabowo"));
    }
}