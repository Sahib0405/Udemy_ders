package Ders03;

import java.util.Scanner;

public class if_tap_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bankamıza xoş gəlmisiniz, illik faiz 11.5%");

        int esas_vesait, depozit_muddeti;

        System.out.print("Bankada saxlamaq istediyiniz vesaitin miqdari: ");
        esas_vesait = input.nextInt();

        System.out.print("Vesaitiniz nece il saxlamaq isteyirsiniz ? ");
        depozit_muddeti = input.nextInt();

        double toplam_vesait = esas_vesait;
        double illik_faiz = 0.115;

        for (int i = 1; i <= depozit_muddeti ; i++) {
            toplam_vesait = (toplam_vesait * illik_faiz) + toplam_vesait;
            System.out.println(i + ". ci ilin sonunda " + toplam_vesait);
        }
    }
}
