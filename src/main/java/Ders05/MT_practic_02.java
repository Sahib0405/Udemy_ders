package Ders05;

import java.util.Scanner;

public class MT_practic_02 {

    public static void toplama_vurma(int a, int b) {
        System.out.println("Toplama Cemi: " + (a + b));
        System.out.println("Vurma Cemi: " + (a * b));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayi giriniz: ");
        int a = input.nextInt();
        System.out.print("ikinci sayi giriniz: ");
        int b = input.nextInt();


        toplama_vurma(a,b);

    }

}
