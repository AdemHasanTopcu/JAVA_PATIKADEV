import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yarı çarpını giriniz: ");
        int yariCap = scanner.nextInt();

        for (int i = 1; i <= yariCap; i++) {

            for (int j = 1; j <= yariCap - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yariCap - 1; i >= 1; i--) {

            for (int j = 1; j <= yariCap - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
