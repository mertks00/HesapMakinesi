import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi1 , sayi2, secim;

        System.out.println("1.Sayınızı giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("2.Sayınızı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("Yapıcağınız işlem? ");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Bölme\n4-Çarpma");
        secim = scanner.nextInt();


        if (secim == 1) {

            System.out.println("Sonuç: " + (sayi1 + sayi2));

        } else if (secim == 2) {

            System.out.println("Sonuç: " + (sayi1 - sayi2));

        } else if (secim == 3) {

            System.out.println("Sonuç: " + (sayi1 / sayi2));

        } else if (secim == 4) {

            System.out.println("Sonuç: " + (sayi1 * sayi2));

        } else {

            System.out.println("Geçersiz İşlem!");

        }


    }
}
