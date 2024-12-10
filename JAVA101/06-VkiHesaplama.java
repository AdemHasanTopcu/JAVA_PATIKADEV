import java.util.Scanner;
public class AHT_TestProject {
    public static void main(String[] args) {
        double kilo,boy,Vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        Vki = (kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz: " + Vki );


    }
}
