package Ders02;

import java.util.Scanner;

public class While_loop04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bankimiza xos gelmisiniz. illik depozit 11.5%-dir.");

        int esaspul, depozit;
        System.out.print("Depozit saxlmaq istediyiniz mebleg: ");
        esaspul = input.nextInt();
        System.out.print("Pulunuzu nece illik depozite saxlamaq isteyirsiniz ? ");
        depozit = input.nextInt();

        double toplampul = esaspul;
        double illikfaiz = 0.115;

        for (int i = 1; i <= depozit; i++) {
            toplampul = (toplampul * illikfaiz) + toplampul;
            System.out.println(i + ". ilin sonunda toplam pul : " + (float) toplampul);
        }




    }
}
