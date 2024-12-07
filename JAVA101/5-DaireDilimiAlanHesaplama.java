import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        double DaireDilimi, yaricap, merkezaci, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çap giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        merkezaci = input.nextInt();
        DaireDilimi = (pi * (yaricap * yaricap) * merkezaci) / 360;
        System.out.print("Daire Diliminin Alanı: " + DaireDilimi);


    }
}
