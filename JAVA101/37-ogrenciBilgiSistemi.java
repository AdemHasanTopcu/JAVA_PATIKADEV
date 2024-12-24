class Ders {
    String dersAdi;
    double sozluNotu;
    double sinavNotu;
    double sozluEtkiYuzdesi;


    public Ders(String dersAdi, double sozluNotu, double sinavNotu, double sozluEtkiYuzdesi) {
        this.dersAdi = dersAdi;
        this.sozluNotu = sozluNotu;
        this.sinavNotu = sinavNotu;
        this.sozluEtkiYuzdesi = sozluEtkiYuzdesi;
    }


    public double dersOrtalamaHesapla() {
        double sinavEtkiYuzdesi = 100 - sozluEtkiYuzdesi;
        return (sozluNotu * sozluEtkiYuzdesi / 100) + (sinavNotu * sinavEtkiYuzdesi / 100);
    }
}

public class Main {
    public static void main(String[] args) {

        Ders fizik = new Ders("Fizik", 90, 60, 20);
        Ders matematik = new Ders("Matematik", 85, 75, 30);
        Ders kimya = new Ders("Kimya", 95, 80, 40);


        System.out.println(fizik.dersAdi + " Ortalaması: " + fizik.dersOrtalamaHesapla());
        System.out.println(matematik.dersAdi + " Ortalaması: " + matematik.dersOrtalamaHesapla());
        System.out.println(kimya.dersAdi + " Ortalaması: " + kimya.dersOrtalamaHesapla());
    }
}
//Sınıfları ayırarak çalıştırınız.
