package Ders03;

import java.util.Scanner;

public class If_tap_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("mehsul sayi");
        int mehsul_sayi = input.nextInt();



        for (int i = 1; i <= mehsul_sayi; i++) {
            System.out.print(i + ". Mehsulun qiymeti: ");
            double mehsulunqiymeti = input.nextDouble();
            if (mehsulunqiymeti > 100) {
                System.out.println("Bahalidir");
            }
            else if (mehsulunqiymeti >= 50 && mehsulunqiymeti <=100) {
                System.out.println("Orta qiymetdir");
            } else {
                System.out.println("Ucuzdur");
            }

        }

    }
}
