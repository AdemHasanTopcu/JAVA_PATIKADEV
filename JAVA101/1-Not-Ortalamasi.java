import java.util.Scanner;

public class VeriTipleri {
    public static void main(String[] args) {
        int matematik, fizik, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        double x = matematik + fizik + turkce + tarih + muzik;
        double Sonuc = x / 5;
        System.out.print("Ortalamanız: " + Sonuc +" ");

        if (Sonuc > 60) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }
    }
}
