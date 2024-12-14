import java.util.Scanner;

public class AHT_TestProject {

    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();
        int toplam = 1;

        for (int i=1; i<=k; i++){
            toplam *= n;
        }
        System.out.println(toplam);
    }

}
