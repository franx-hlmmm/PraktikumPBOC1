public class coercionMain {
    public static void main(String[] args) {
        // CASTING
        // char ke integer
        int outputCharC = 'C';
        System.out.println("Hasil konversi karakter 'C' ke int: " + outputCharC);
        
        // double ke int
        double output = 67.7;
        int outputInt = (int) output;
        System.out.println("Hasil konversi double " + output + " ke int: " + outputInt);
        
        // int ke double
        int korupsi = 271;
        double outputDouble = korupsi;
        System.out.println("Hasil konversi int " + korupsi + " ke double: " + outputDouble);

        // int ke char
        int ordebaru = 98;
        char outputCharOrBa = (char) ordebaru;
        System.out.println("Hasil konversi int " + ordebaru + " ke char: " + outputCharOrBa);

        // char ke double
        char a = 'a';
        double outputDoubleA = a;
        System.out.println("Hasil konversi char 'a' ke double: " + outputDoubleA);

        // a. Polimorfisme nilai integer 65
        int intValue = 65;
        System.out.println("Sebagai integer: " + intValue);
        System.out.println("Sebagai karakter: " + (char) intValue);
        System.out.println("Sebagai real: " + (double) intValue);

        // b. Konversi integer ke real dan kembali ke integer
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("Nilai real: " + realValue);
        System.out.println("Kembali ke integer: " + newIntValue);

        // c. Konkatenasi dan penjumlahan String X & Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int sum = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y: " + S);
        System.out.println("penjumlahan X dan Y: " + sum);

        // d. Konkatenasi dan penjumlahan P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q: " + R);
        System.out.println("Penjumlahan P dan Q: " + D);

        // e. Konversi nilai S menjadi integer
        Integer A = Integer.parseInt(S);
        System.out.println("Konversi S ke integer A: " + A);
        System.out.println("cek khodam A: " + A.getClass().getSimpleName());

        // f. Konversi nilai A menjadi String
        String T = A.toString();
        System.out.println("Konversi A ke String T: " + T);
        System.out.println("cek khodam T: " + T.getClass().getSimpleName());
    }
}
