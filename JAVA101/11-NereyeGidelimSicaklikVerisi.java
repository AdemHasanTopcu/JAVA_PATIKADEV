import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.print("Kayak yapmanızı öneriyorum. ");
        } else if (sicaklik > 5 && sicaklik < 25) {
            if (sicaklik <=15) {
                System.out.print("Sinemayua gitmenizi öneriyorum. ");}

                if (sicaklik >= 10) {
                    System.out.print("Pikniğe gitmenizi öneriyorum. ");
                }

            }
        else System.out.print("Doğru bir sıcaklık giriniz. ");
        }}

