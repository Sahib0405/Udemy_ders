package Ders05;

import java.util.Scanner;

public class Mt_proje02_ebob {

    public static int ebobBulma(int num1, int num2) {
        int ebob = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i ==0 && num2 % 1 == 0){
                ebob = i;
            }
        } return ebob;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayi yazin: ");
        int oneNum = input.nextInt();
        System.out.print("Ikinci sayi yazin: ");
        int twoNum = input.nextInt();
        System.out.println("Iki sayinin Ebobu: " + ebobBulma(oneNum,twoNum));
    }
}

