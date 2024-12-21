import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalKontrol(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    public static boolean asalKontrol(int sayi, int i) {

        if (sayi <= 1) {
            return false;
        }


        if (i * i > sayi) {
            return true;
        }

        if (sayi % i == 0) {
            return false;
        }

        return asalKontrol(sayi, i + 1);
    }
}
