package Ders05;

import java.util.Scanner;

public class Mt01_Void_Parantez_bos {

        public static void toplama(){
            System.out.println("Toplama: " + (10+10));
        }

        public static void salamlama(){

        System.out.println("Salam necesiz");
        System.out.println("Isler nece gedir");
        }

        public static void faktoriyel() {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        while (sayi > 0){
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
            System.out.println("Faktoriyel = " + faktoriyel);

    }

    public static void main(String[] args) {

            faktoriyel();
            salamlama();
            salamlama();
            toplama();

    }
}
