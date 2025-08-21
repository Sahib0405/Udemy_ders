package Ders02;

import java.util.Scanner;

public class While_loop05 {
    public static void main(String[] args) {


       /* for (int i = 0; i < 10; i++) {
            System.out.println("i = " +i);
        }

      int i = 10;
      while (i < 100){
          System.out.println("i = " + i);
          i=i+3;
      }

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz ");

        int num = input.nextInt();

        int faktoriyal = 1;

        while (num > 0){
            faktoriyal *= num;
            System.out.println("Num = " + num);
            num--;
        }
        System.out.println("Faktoriyal = " + faktoriyal);

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");

        int num = input.nextInt();
        int total = 0;
        do {
            total = total + num % 10;
            num = num / 10;
            System.out.println("num = " + num);
        } while (num > 0);
        System.out.println("Reqemlerin toplami = " + total);


    }
}
