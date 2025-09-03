package Ders05;

import java.util.Scanner;

public class MT_practic_08 {
    public static void cumleOndefe (String a){
        for (int i = 0; i < 10; i++) {
            System.out.println("CumleOndefe: " + a);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Her hansi bir cumle yazin: ");
        String a = input.nextLine();


        cumleOndefe(a);
        input.close();
    }
}
