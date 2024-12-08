import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);
        System.out.print("1.SAYI: ");
        sayi1 = input.nextInt();
        System.out.print("2.SAYI: ");
        sayi2 = input.nextInt();
        System.out.print("3.SAYI: ");
        sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En büyük sayı: " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük sayı: " + sayi2);
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.println("En büyük sayı: " + sayi3);
        } else if (sayi1 == sayi2 && sayi1 == sayi3) {
            System.out.println("Üç sayı eşittir.");
        }
        else
        System.out.print("Lütfen sayı giriniz.");
    }
}
