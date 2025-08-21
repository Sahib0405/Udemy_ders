package Ders03;

import java.util.Scanner;

public class if_tap_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Esas vesait giriniz: ");
        double esas_vesait = input.nextDouble();

        System.out.print("Depozitin muddeti: ");
        int depozitin_muddeti = input.nextInt();

        double toplam_vesait = esas_vesait;
        double illik_fazi = 0.115;



        for (int i = 1; i <= depozitin_muddeti; i++) {
            toplam_vesait = (toplam_vesait * illik_fazi) + toplam_vesait;
            System.out.println(i + ".ci il " + (float) toplam_vesait);
        }



    }
}
