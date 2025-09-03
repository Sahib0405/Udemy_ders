package Ders04;

import java.util.Scanner;

public class bki_01 {
    public static void main(String[] args) {

      /*
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu yazin: ");
        double weight = input.nextDouble();
        System.out.print("Boyunuzu yazin: ");
        double height = input.nextDouble();

        double bki = weight / (height * height);
        System.out.println("Beden kutle indeksiniz " + (int) bki);
        */

        double boy = 1.85;
        double ceki = 90.0;
        double bki = ceki / (boy * boy);
        System.out.println("BKI: " + bki);
    }
}
