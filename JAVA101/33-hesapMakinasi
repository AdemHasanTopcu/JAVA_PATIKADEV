import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1 - Toplama İşlemi");
            System.out.println("2 - Çıkarma İşlemi");
            System.out.println("3 - Çarpma İşlemi");
            System.out.println("4 - Bölme İşlemi");
            System.out.println("5 - Üslü Sayı Hesaplama");
            System.out.println("6 - Faktoriyel Hesaplama");
            System.out.println("7 - Mod Alma");
            System.out.println("8 - Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0 - Çıkış");

            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplama(scanner);
                    break;
                case 2:
                    cikarma(scanner);
                    break;
                case 3:
                    carpma(scanner);
                    break;
                case 4:
                    bolme(scanner);
                    break;
                case 5:
                    usluSayi(scanner);
                    break;
                case 6:
                    faktoriyel(scanner);
                    break;
                case 7:
                    modAlma(scanner);
                    break;
                case 8:
                    dikdortgen(scanner);
                    break;
                case 0:
                    System.out.println("Çıkıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        } while (secim != 0);

        scanner.close();
    }

    public static void toplama(Scanner scanner) {
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (sayi1 + sayi2));
    }

    public static void cikarma(Scanner scanner) {
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (sayi1 - sayi2));
    }

    public static void carpma(Scanner scanner) {
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (sayi1 * sayi2));
    }

    public static void bolme(Scanner scanner) {
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        if (sayi2 != 0) {
            System.out.println("Sonuç: " + (sayi1 / sayi2));
        } else {
            System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
        }
    }

    public static void usluSayi(Scanner scanner) {
        System.out.print("Tabanı girin: ");
        double taban = scanner.nextDouble();
        System.out.print("Üssü girin: ");
        double us = scanner.nextDouble();
        System.out.println("Sonuç: " + Math.pow(taban, us));
    }

    public static void faktoriyel(Scanner scanner) {
        System.out.print("Faktoriyeli hesaplanacak sayıyı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayının faktoriyeli hesaplanamaz.");
        } else {
            long sonuc = 1;
            for (int i = 1; i <= sayi; i++) {
                sonuc *= i;
            }
            System.out.println(sayi + " sayısının faktoriyeli: " + sonuc);
        }
    }

    public static void modAlma(Scanner scanner) {
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Sonuç: " + (sayi1 % sayi2));
    }

    public static void dikdortgen(Scanner scanner) {
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();

        double alan = kisaKenar * uzunKenar;
        double cevre = 2 * (kisaKenar + uzunKenar);

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}
