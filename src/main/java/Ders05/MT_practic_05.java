package Ders05;

import java.util.Scanner;

public class MT_practic_05 {
    public static void boyukEdediCap (int a, int b){
            if (a > b){
            System.out.print("Boyuk eded: " + a);
        }   else if (b > a) {
            System.out.print("Boyuk eded: " + b);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci ededi giriniz: ");
        int a = input.nextInt();
        System.out.print("Ikinci ededi giriniz: ");
        int b = input.nextInt();
        boyukEdediCap(a, b);
    }
}
