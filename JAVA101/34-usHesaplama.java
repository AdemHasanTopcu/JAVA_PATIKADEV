import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        double taban = scanner.nextDouble();
        System.out.print("Üssü girin: ");
        int us = scanner.nextInt();

        double sonuc = usHesapla(taban, us);

        System.out.println(taban + " üssü " + us + " = " + sonuc);

        scanner.close();
    }

    public static double usHesapla(double taban, int us) {

        if (us == 0) {
            return 1;
        }

        return taban * usHesapla(taban, us - 1);
    }
}
