import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        double a, b, c, d, cevre, alan;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b = girdi.nextInt();
        System.out.print("3.Kenarı Giriniz: ");
        c = girdi.nextInt();

        cevre = ((a + b + c));
        System.out.print("Çevresi: " + cevre);

        d = cevre / 2;

        alan = Math.sqrt(d * (d - a) * (d - b) * (d - c));
        System.out.print("Alanı: " + alan);


    }
}
