import java.util.Scanner;

public class VeriTipleri {
    public static void main(String[] args) {
        double tutar, kdvli, yeni;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarınızı giriniz: ");
        tutar = input.nextDouble();
        if (0 < tutar && tutar <= 1000) {
            kdvli = tutar * 0.18;
            yeni = kdvli + tutar;
            System.out.print("Kdvli tutarınız:" + yeni);
        } else if (tutar > 1000) {
            kdvli = tutar * 0.08;
            yeni = kdvli + tutar;
            System.out.print("Kdvli Tutarınız:" + yeni);
        } else {
            System.out.print("Lütfen gerçek bir tutar giriniz");
        }
    }
}
