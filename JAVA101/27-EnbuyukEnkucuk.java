import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayi gireceksiniz? ");
        int N = input.nextInt();

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 1; i < N; i++) {
            System.out.print("Bir sayı girin: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayi: " + enBuyuk);
        System.out.println("En küçük sayi: " + enKucuk);
    }
}
