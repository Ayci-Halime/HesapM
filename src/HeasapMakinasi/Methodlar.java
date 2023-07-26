package HeasapMakinasi;

import java.util.Scanner;

public class Methodlar {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap makinemıza hosgeldiniz ");
        System.out.println("Hangi işlemi yapmak istersinz : \nToplama-1\nCıkarma-2\nCarpma-3\nBolme-4");
        int secim = scan.nextInt();
        System.out.println("İşlem yapmak istediğiniz sayıları giriniz :");
        int num01 = scan.nextInt();
        int num02 = scan.nextInt();

        // to do : bu menuyu while içine al --> dogru girene kadar döngu dönsun
        switch (secim) {
            case 1:
                toplama(num01, num02);
                menu();
                break;
            case 2:
                cıkarma(num01, num02);
                menu();
                break;
            case 3:
                carpma(num01, num02);
                menu();
                break;
            case 4:
                bolme(num01, num02);
                menu();
                break;
            default:
                System.out.println();
        }

    }

    // to do : Buyugu kucuge bol
    public void bolme(int num01, int num02) {
        System.out.println("bolme sonucu : " + (num01 / num02));

    }

    public void carpma(int num01, int num02) {
        System.out.println("çarpma sonucu : " + (num01 * num02));
    }

    // to do : buyukten kucugu çıkar
    private static void cıkarma(int num01, int num02) {
        System.out.println("cıkarma sonucu : " + (num01 - num02));
    }

    private static void toplama(int num01, int num02) {
        System.out.println("toplama sonucu : " + (num01 + num02));
    }


}
