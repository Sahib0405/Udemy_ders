package Ders02;

import java.util.Scanner;

public class While_loop01 {
    public static void main(String[] args) {



/*
        Scanner input = new Scanner(System.in);
        int balans = 1000;
        String emeliyyatlar = "1. Emeliyyat: Balans oyrenmek\n"
                                + "2. Emeliyyat: Pul cixartmaq\n"
                                + "3. Emeliyyat: Pul yerlesdirmek\n"
                                + "Cixis ucun exit yazin";

        System.out.println("*****************************");
        System.out.println(emeliyyatlar);
        System.out.println("*****************************");

        while (true) {

            System.out.print("Emeliyyati secin ");
            String emeliyyat = input.nextLine();

            if (emeliyyat.equals("exit")){
                System.out.println("Programdan cixis");
                break;
            } else if (emeliyyat.equals("1")) {
                System.out.println("Balans oyrenmek: " + balans);
            } else if (emeliyyat.equals("2")) {
                System.out.println("Pul cixartmaq istediyiniz mebleg: ");
                int mebleg = input.nextInt();
                input.nextLine();
                if (balans - mebleg < 0){
                    System.out.println("Balans yeterli deyil. Balansiniz: " + balans);
                } else {
                    balans = balans - mebleg;
                    System.out.println("Hal-hazirki balans: " + balans);
                }

            } else if (emeliyyat.equals("3")) {
                System.out.println("Pul yerlesdirmek istediyiniz meblegi secin");
                int mebleg = input.nextInt();
                input.nextLine();
                balans = balans + mebleg;
                System.out.println("Hal-hazirki balans: " + balans);
            } else {
                System.out.println("Kecersiz secim");
            }
        }*/
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Basamak sayisi: ");
        int basamak_sayisi = input.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);

        } while (gecici_sayi > 0);

        if (sayi == toplam) {
            System.out.println("Bu sayi armstrong sayisidir...");
        } else {
            System.out.println("Armstong sayi deyil");
        }

/*
        int number = 1;

        do {
            int originalNumber = number;
            int sum = 0;
            int temp = number;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == originalNumber) {
                System.out.println("Armstrong sayi = " + sum);
            }
            number++;

        } while (number <= 10000);

 */
    }
}
