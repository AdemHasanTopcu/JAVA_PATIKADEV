import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println("4'ün kuvvetleri: " + i);

        }
        for (int k = 1; k <= sayi; k *= 5) {
            System.out.println("5'in kuvvetleri: " + k);
        }
    }
}
