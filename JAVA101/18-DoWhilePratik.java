import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi%2==0){
               toplam += sayi;
            }
        } while (sayi%2==0);
        System.out.println("Toplam: " + toplam);
    }
}
