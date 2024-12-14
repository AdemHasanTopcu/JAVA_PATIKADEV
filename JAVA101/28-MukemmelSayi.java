import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        int sayi,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        sayi = input.nextInt();

        toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}


