import java.util.Scanner;

public class AHT_TestProject {
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static long kombinasyon(int n, int r) {

        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n degerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r degerini girin: ");
        int r = scanner.nextInt();

        long sonuc = kombinasyon(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + sonuc);

        scanner.close();
    }
}
