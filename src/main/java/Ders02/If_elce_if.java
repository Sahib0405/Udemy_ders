package Ders02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If_elce_if {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);
        System.out.print("sayi yazin ");

        int x = input.nextInt();

        if (x > 10) {
            System.out.println(x + " > " + 10);
        } else if (x < 10) {
            System.out.println("Kicikdir");
        } else if (x == 10) {
            System.out.println("Beraberdir");
        }
        */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Sayalari xahis edirik yazin");

        int x = input.nextInt();
        int y = input.nextInt();

        if (x == y)
        {
            System.out.println("Beraberdir");
        }
        else if (x > y)
        {
            System.out.println("Boyukdur");
        }
        else
        {
            System.out.println("Kicikdir");
        }
        */

        Scanner input = new Scanner(System.in);
        System.out.println("1ci vize notunu yazin");
        int a = input.nextInt();
        System.out.println("2ci vize notunu yazin");
        int b = input.nextInt();
        System.out.println("Final notunu yazin");
        int c = input.nextInt();

        double ort = ((0.4 * a) + (0.4 * b) + (0.6 * c)) / 3;
        System.out.println("Ortalama = " + ort);
        //double w1 = (a / 100) * 40;
       //double w2 = (b / 100) * 40;
       // double f = (c / 100) * 60;
        //double medium = (w1 + w2 +f) /3;



        if (ort < 50)
        {
            System.out.println("50faizden kuck oldugu ucun qaldi");
        }
        else
        {
            System.out.println("Gecti");
        }



    }
}
