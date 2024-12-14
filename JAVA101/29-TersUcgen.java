import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
