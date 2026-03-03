/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Februari 2026
*/
public class Titik {
    /****ATRIBUT****/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    /****METHOD****/
    //Konstruktor titik (0,0)
    public Titik(){
        absis = 0.0;
        ordinat = 0.0;
        counterTitik++;
    }

    //Konstruktor Titik (x,y)
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //selektor
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    //mutator
    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    //OPERATOR FUNGSI
    //translasi
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    //Kuadran
    public int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    //JarakTitik ke pusat 0,0
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2.0) + Math.pow(ordinat, 2.0));
    }
    //JarakTitik antara 2 titik
    public double getJarak(Titik T2){
        return Math.sqrt(Math.pow((absis-T2.getAbsis()), 2.0) + Math.pow((ordinat-T2.getOrdinat()), 2.0));
    }
    //Refleksi
    public void refleksiX(){
        ordinat = -1*ordinat;
    }
    public void refleksiY(){
        absis = -1*absis;
    }
    public Titik getRefleksiX(){
        //Kamus Lokal
        Titik T2 = new Titik();
        //Algoritma
        T2.setAbsis(this.absis);
        T2.setOrdinat(this.ordinat*-1);
        return T2;
    }
    public Titik getRefleksiY(){
        //Kamus Lokal
        Titik T2 = new Titik();
        //Algoritma
        T2.setAbsis(this.absis*-1);
        T2.setOrdinat(this.ordinat);
        return T2;
    }
    
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ") ");
    }

    //mengembalikan nilai counter titik
    public static int getcounterTitik(){
        return counterTitik;
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
}