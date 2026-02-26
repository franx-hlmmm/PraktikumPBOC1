/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Farras Hilmy Zaidan - 24060124120003
 * Tanggal      : 26 Februari 2026
*/
public class Titik {
    /****ATRIBUT****/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    /****METHOD****/
    //Konstruktor titik (0,0)
    Titik(){
        absis = 0.0;
        ordinat = 0.0;
        counterTitik++;
    }

    //Konstruktor Titik (x,y)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //selektor
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    //mutator
    void setAbsis(double absis){
        this.absis = absis;
    }

    void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    //OPERATOR FUNGSI
    //JarakTitik ke pusat 0,0
    double jarakTitik(){
        return Math.sqrt(Math.pow(absis, 2.0) + Math.pow(ordinat, 2.0));
    }
    //JarakTitik antara 2 titik
    double jarakTitik(Titik T2){
        return Math.sqrt(Math.pow((absis-T2.getAbsis()), 2.0) + Math.pow((ordinat-T2.getOrdinat()), 2.0));
    }
    //Dilatasi
    void dilatasi(double i){
        absis = i*absis;
        ordinat = i*ordinat;
    }
    //Translasi
    void translasi(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    //Refleksi
    void refleksiX(){
        ordinat = -1*ordinat;
    }
    void refleksiY(){
        absis = -1*absis;
    }
    Titik getRefleksiX(){
        //Kamus Lokal
        Titik T2 = new Titik();
        //Algoritma
        T2.setAbsis(this.absis);
        T2.setOrdinat(this.ordinat*-1);
        return T2;
    }
    Titik getRefleksiY(){
        //Kamus Lokal
        Titik T2 = new Titik();
        //Algoritma
        T2.setAbsis(this.absis*-1);
        T2.setOrdinat(this.ordinat);
        return T2;
    }
    //Kuadran
    int kuadran(){
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

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ") ");
    }

    //mengembalikan nilai counter titik
    static int getcounterTitik(){
        return counterTitik;
    }
}