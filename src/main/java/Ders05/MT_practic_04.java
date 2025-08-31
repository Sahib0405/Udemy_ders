package Ders05;

import java.util.Scanner;

public class MT_practic_04 {
    public static int toplama(int a) {
        return a + 5;
    }
    public static int vurma(int a) {
        return a * 5;
    }
    public static int cixma(int a) {
        return a - 5;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a = input.nextInt();
        System.out.println(cixma(vurma(toplama(a))));
    }
}
