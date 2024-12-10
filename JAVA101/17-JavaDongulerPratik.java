import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        int toplam = 0;
        int sayac = 0;

        for (int i=1 ; i<=sayi; i++){

            if (i%4==0 && i%3==0){
                toplam +=i;
                sayac++;
            System.out.println("Girmiş olduğunuz sayıya göre 3 ve 4'e tam bölünen sayılar: " +i);
            }


        }
        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı yok.");
        }
    }
}
