import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        double mesafe, fiyat;
        int yas, yolculukTipi;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz (KM): ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        fiyat = mesafe * 0.10;
        if (yas < 12) {
            fiyat -= fiyat * 0.50;
        } else if (yas <= 24) {
            fiyat -= fiyat * 0.10;
        } else if (yas > 65) {
            fiyat -= fiyat * 0.30;
        }
        if (yolculukTipi == 2) {
            fiyat -= fiyat * 0.20;
        }
        if (yolculukTipi == 2) {
            fiyat *= 2;
        }
        System.out.println("Toplam Bilet Fiyatı: " + fiyat + " TL");
    }
}
