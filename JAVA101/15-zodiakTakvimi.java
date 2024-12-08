import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int dogumYili, kalan;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili < 1900 || dogumYili > 2024) {
            System.out.println("Hatalı Doğum Yılı Girdiniz!");
            return;
        }
        kalan = dogumYili % 12;

        if (kalan == 0) {
            System.out.println("Maymun");
        }
        else if (kalan == 1) {
            System.out.println("Horoz");
        }
        else if (kalan == 2) {
            System.out.println("Köpek");
        }
        else if (kalan == 3) {
            System.out.println("Domuz");

        }else if (kalan == 4) {
            System.out.println("Fare");

        }else if (kalan == 5) {
            System.out.println("Öküz");

        }else if (kalan == 6) {
            System.out.println("Kaplan");

        }else if (kalan == 7) {
            System.out.println("Tavşan");

        }else if (kalan == 8) {
            System.out.println("Ejderha");

        }else if (kalan == 9) {
            System.out.println("Yılan");

        }else if (kalan == 10) {
            System.out.println("At");

        }else {
            System.out.println("Koyun");

        }
    }
}
