/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas Piaraan untuk mengelola antrean (Queue) objek Anabul di klinik.
 * Pembuat      : Farras Hilmy Zaidan / 24060124120003
 * Tanggal      : 7 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    /***ATRIBUT***/
    private Integer nbelm;
    private Queue<Anabul> Lanabul;

    /***METHOD***/
    public Piaraan() {
        nbelm = 0;
        Lanabul = new LinkedList<>();
    }
    
    public Integer getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        if (anabul != null) {
            Lanabul.add(anabul);
            nbelm += 1;
        }
    }

    public boolean isMember(Anabul anabul) {
        if (anabul == null || anabul.getPanggilan() == null) {
            return false;
        }
        for (Anabul e : Lanabul) {
            if (e.getPanggilan() != null && e.getPanggilan().equals(anabul.getPanggilan())) {
                return true;
            }
        }
        return false;
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul anabulKeluar = Lanabul.poll();
        if (anabulKeluar != null) {
            nbelm -= 1;
        }
        return anabulKeluar;
    }

    public void showAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getPanggilan());
        }
    }

    public Integer countKucing() {
        Integer counter = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                counter += 1;
            }
        }
        return counter;
    }

    public Double bobotKucing() {
        Double totalBobot = 0.0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul anabul : Lanabul) {
            String jenis = anabul.getClass().getSimpleName(); 
            if (anabul instanceof Kucing && !jenis.equals("Kucing")) {
                jenis = "Kucing " + jenis;
            }
            System.out.println(anabul.getPanggilan() + " merupakan seekor " + jenis);
        }
    }
}
