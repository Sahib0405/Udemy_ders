package Ders02;

import java.util.Scanner;

public class While_loop06 {
    public static void main(String[] args) {



        /* final double pi = 3.14;
        double s, l;


        for (int r = 1; r <= 10; r++) {
            s = pi * r * r;
            l = 2 * pi * r;
            System.out.println("R = " + r + "\tsahe = " + s + "\t Uzunluq = " + l);
        }
        */

        /*double F;

        for (int c = 0; c <= 100 ; c++) {
            F=1.8 * c +32;
            System.out.println("Selsi = " + c + "\tFaranheyt = " + F);
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        System.out.println("Baslangiz qiymet");
        int numb = input.nextInt();
        System.out.println("Son qiymet");
        int nums = input.nextInt();
        System.out.println("Artim qiymeti");
        int numa = input.nextInt();

        for (int i = numb; i <= nums; i = i + numa) {

            System.out.println(i);

        }






    }

}

