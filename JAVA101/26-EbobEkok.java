import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int n2 = input.nextInt();

        int ebob = n1;
        while (ebob > 0) {
            if (n1 % ebob == 0 && n2 % ebob == 0) {
                break;
            }
            ebob--;
        }

        int ekok = (n1 * n2) / ebob;

        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + ekok);

        input.close();
    }
}


