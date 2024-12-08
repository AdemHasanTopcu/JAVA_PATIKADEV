import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        String kulAdi, kulSifre, secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        kulAdi = input.nextLine();
        System.out.print("Şifreniz: ");
        kulSifre = input.nextLine();

        if ((kulAdi.equals("AHT")) && (kulSifre.equals("12345"))) {
            System.out.print("Giriş Başarılı");
        } else {
            System.out.print("Bilgileriniz Yanlış\n");
            if (!kulSifre.equals("12345")) {
                System.out.print("Şifreniz Hatalı!\n");
                System.out.print("Şifre Değiştirelim mi ? ('Evet','Hayır') ");
                secim = input.nextLine();
                if (secim.equals("Evet")) {
                    System.out.print("Yeni Şifre Giriniz: ");
                    kulSifre = input.nextLine();
                    if (kulSifre.equals("12345")) {
                        System.out.print("Şifre eski şifreniz ile aynıdır. Tekrar deneyiniz.");
                    } else {
                        System.out.print("Şifre Değişimi Başarılı. ");
                    }
                } else System.out.print("Daha sonra tekrar deneyiniz.");
            } else System.out.print("Hatalı ya da yanlış bilgiler girdiniz.");

        }


    }
}
