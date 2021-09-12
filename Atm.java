package JavaProjects;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bakiye = 10000;
        System.out.println("1 Bakiye Sorgulama");
        System.out.println("2 Para Çekme");
        System.out.println("3 Para Yatırma");
        while (true) {
            System.out.println("Lütfen işleminizi giriniz.");
            int islem = s.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Bakiyeniz " + bakiye + " TL'dir.");
                    break;
                    case 2:
                    System.out.println("Miktar giriniz");
                    int miktar = s.nextInt();
                    bakiye = bakiye - miktar;
                        System.out.println("Yeni bakiye " + bakiye + "TL'dir.");
                        break;
                case 3 :
                    System.out.println("Miktar giriniz");
                    int miktar1 = s.nextInt();
                    bakiye = miktar1 + bakiye;
                    System.out.println("Yeni bakiye " + bakiye + "TL'dir.");
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz.");
                    break;
            }
             }
        }



}
