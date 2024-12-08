import java.util.Scanner;

public class AHT_TestProject {
    public static void main(String[] args) {
        int dogumGunu;
        String dogumAyi;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz: ");
        dogumAyi = input.nextLine();
        System.out.print("Doğduğunuz Günü Giriniz: ");
        dogumGunu = input.nextInt();

        String[] Aylar = {
                "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
                "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"
        };

        boolean validMonth = false;
        for (String month : Aylar) {
            if (dogumAyi.equalsIgnoreCase(month)) {
                validMonth = true;
                break;
            }
        }

        if (!validMonth) {
            System.out.println("Hata: Geçersiz ay ismi. Lütfen geçerli bir ay giriniz.");
            return;
        }

        if ((dogumAyi.equals("Ocak") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Şubat") && (dogumGunu < 1 || dogumGunu > 28)) || // Şubat için 28 gün
                (dogumAyi.equals("Mart") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Nisan") && (dogumGunu < 1 || dogumGunu > 30)) ||
                (dogumAyi.equals("Mayıs") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Haziran") && (dogumGunu < 1 || dogumGunu > 30)) ||
                (dogumAyi.equals("Temmuz") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Ağustos") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Eylül") && (dogumGunu < 1 || dogumGunu > 30)) ||
                (dogumAyi.equals("Ekim") && (dogumGunu < 1 || dogumGunu > 31)) ||
                (dogumAyi.equals("Kasım") && (dogumGunu < 1 || dogumGunu > 30)) ||
                (dogumAyi.equals("Aralık") && (dogumGunu < 1 || dogumGunu > 31))) {

            System.out.println("Hata: Bu ay için geçerli bir gün giriniz.");
            return;
        }

        if (dogumAyi.equals("Ocak")) {{
                if (dogumGunu <= 21) {
                    System.out.println("Oğlak");


                } else {
                    System.out.println("Kova");

                }

            }
        }

        if (dogumAyi.equals("Şubat")) {
            if (dogumGunu <= 19) {
                System.out.println("Kova");


            } else {
                System.out.println("Balık");
            }

        }
        if (dogumAyi.equals("Mart")) {
            if (dogumGunu <= 20) {
                System.out.println("Balık");


            } else {
                System.out.println("Koç");
            }


        }
        if (dogumAyi.equals("Nisan")) {
            if (dogumGunu <= 20) {
                System.out.println("Koç");


            } else {
                System.out.println("Boğa");
            }


        }if (dogumAyi.equals("Mayıs")) {
            if (dogumGunu <= 21) {
                System.out.println("Boğa");


            } else {
                System.out.println("İkizler");
            }


        }if (dogumAyi.equals("Haziran")) {
            if (dogumGunu <= 22) {
                System.out.println("İkizler");


            } else {
                System.out.println("Yengeç");
            }


        }if (dogumAyi.equals("Temmuz")) {
            if (dogumGunu <= 22) {
                System.out.println("Yengeç");


            } else {
                System.out.println("Aslan");
            }


        }if (dogumAyi.equals("Ağustos")) {
            if (dogumGunu <= 22) {
                System.out.println("Aslan");


            } else {
                System.out.println("Başak");
            }


        }if (dogumAyi.equals("Eylül")) {
            if (dogumGunu <= 22) {
                System.out.println("Başak");


            } else {
                System.out.println("Terazi");
            }


        }if (dogumAyi.equals("Ekim")) {
            if (dogumGunu <= 22) {
                System.out.println("Terazi");


            } else {
                System.out.println("Akrep");
            }


        }if (dogumAyi.equals("Kasım")) {
            if (dogumGunu <= 21) {
                System.out.println("Akrep");


            } else {
                System.out.println("Yay");
            }


        }if (dogumAyi.equals("Aralık")) {
            if (dogumGunu <= 21) {
                System.out.println("Yay");


            } else {
                System.out.println("Oğlak");
            }


        }
    }
}
