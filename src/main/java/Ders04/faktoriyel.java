package Ders04;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {

        /*int num = 5;
        int faktoriyel = 1;
        while (num > 0){
            faktoriyel *= num;
            //System.out.println( " num " + num + " Faktoriyel " + faktoriyel);
            num--;
        }
        System.out.println("faktoriyel " + faktoriyel);*/



        Scanner input = new Scanner(System.in);
        System.out.print("Her hansi bie sayi giriniz: ");

        int sayi = input.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
            System.out.println("sayi " + sayi + " faktoriyel " + faktoriyel);
        }
        System.out.println("Faktoriyel " + faktoriyel);

    }
}
