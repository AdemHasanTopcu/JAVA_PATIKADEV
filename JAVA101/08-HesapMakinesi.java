import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("\nSeçiminiz :");
        secim = input.nextInt();

        switch (secim) {

            case 1:
                System.out.print("Toplama işlemi: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma işlemi: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpma işlemi: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.print("Bölme işlemi: " + (sayi1 / sayi2));
                break;

            default:
                System.out.println("Yanlış veya hatalı bir işlem yaptınız.");
                break;

        }
    }
}
