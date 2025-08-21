package Ders04;

import java.util.Scanner;

public class Ucbucaq_hipetonuz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar: ");
        int a = input.nextInt();

        System.out.print("Ikinci kenar: ");
        int b = input.nextInt();

        double h = Math.sqrt(a * a  + b * b) ;
        System.out.println("Hipetonuz = " + (float) h);
    }
}
