package Ders04;

import java.util.Scanner;

public class km_yanacaq {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masininiz 1km nece qepik istifade edir ? (Numune: 0.22qep) ");
        double manat = input.nextDouble();
        System.out.println("Masininizla nece km getdiniz ? ");
        int km = input.nextInt();
        System.out.println("Odenilecek mebleg: " + (manat * km) + " manatdir");


    }
}
