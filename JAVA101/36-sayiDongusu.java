import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        sayiIslemi(n);

        scanner.close();
    }

    public static void sayiIslemi(int n) {

        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        sayiIslemi(n - 5);
        System.out.println(n);
    }
}
