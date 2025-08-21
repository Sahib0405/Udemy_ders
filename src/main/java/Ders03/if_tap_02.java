package Ders03;

import java.util.Scanner;

public class if_tap_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Xahiş edirik tələbələrin sayini giriniz: ");

        int telebe_sayi = input.nextInt();
        for (int i = 1; i <= telebe_sayi ; i++) {
            System.out.print(i + ". Telebenin imtahan balini yazin xahis edirik: ");
            int imtahan_bali = input.nextInt();
            if (imtahan_bali >= 90){
                System.out.println("Ela");
            } else if (imtahan_bali >= 70) {
                System.out.println("Yaxsi");
            } else if (imtahan_bali >= 50) {
                System.out.println("Kafi");
            } else {
                System.out.println("Zeif");
            }
        }

    }
}
