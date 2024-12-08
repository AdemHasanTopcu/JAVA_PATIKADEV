import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil <= 0) {
            System.out.println("Yıl negatif olamaz.");
        } else {
            if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
                System.out.println(yil + " yılı bir artık yıldır.");
            } else {
                System.out.println(yil + " yılı bir artık yıl değildir.");
            }
        }
    }
}
