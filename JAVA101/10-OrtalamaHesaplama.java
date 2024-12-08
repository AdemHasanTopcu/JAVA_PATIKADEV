import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int toplamNot = 0;
        int dersSayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        if (matematik > 0 && matematik <= 100) {
            toplamNot += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce > 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplamNot / dersSayisi;
            System.out.println("Ortalamanız: " + ortalama);
        } else {
            System.out.println("Geçerli not girmediniz.");
        }

        input.close();
    }
}
