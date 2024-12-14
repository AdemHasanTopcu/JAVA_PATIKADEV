import java.util.Scanner;

public class AHT_TestProject {

    public static int basamakToplami(int sayi) {
        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }

        return toplam;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int sonuc = basamakToplami(sayi);

        System.out.println("Sayının basamaklarının toplamı: " + sonuc);

        input.close();
    }
}
