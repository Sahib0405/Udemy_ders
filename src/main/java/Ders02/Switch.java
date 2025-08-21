package Ders02;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        System.out.println("Birinci edei daxil edin");
        int num1 = input.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int num2 = input.nextInt();

        int enkicik = 0;

        if (num1 > num2)
        {
            enkicik = num2;
            if (enkicik % 2 == 0)
            {
                System.out.println("Cut");
            }
            else
            {
                System.out.println("Tek");
            }
        }

        else if (num1 < num2)
        {
            enkicik = num1;
            if (enkicik % 2 == 0)
            {
                System.out.println("Cut ");
            }
            else {
                System.out.println("tek");
            }
        }
        else {
            System.out.println(num1 + " = " + num2);

        }

        */


        /*Scanner input = new Scanner(System.in);

        System.out.println("1-4 arsi reqemleri yazin");

        int m = input.nextInt();




        switch (m) {
            case 1:
                System.out.println("Yaz");

                break;
            case 2:
                System.out.println("Yay");

                break;
            case 3:
                System.out.println("Payiz");

                break;
            case 4:
                System.out.println("Qis");
                break;
            default:
                System.out.println("Qeyd edilen reqemleri giriniz");

    } */

       /* Scanner input = new Scanner(System.in);

        System.out.println("1-7 arasi reqemlerini yazmaqla heftenin gunleri yazilacaq");
        int week = input.nextInt();

        switch (week){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wensday");
                break;
            case 4 :
                System.out.println("Thirsday");
                break;
            case 5 :
                System.out.println("Friyday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Qeyd edilen reqemleri yazin");

        }*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Xahis edirik bir sayi giriniz");

        int num = input.nextInt();

        if (num > 0 ){
            System.out.println("Musbet");
        } else if (num < 0){
        System.out.println("Menfi");
    } else {
        System.out.println("Neytral reqemdir");
    } */

        /*Scanner input = new Scanner(System.in);

        System.out.println("her hansi bir sayi yazin");

        int num = input.nextInt();

        if ((num * 35 /100) > 1000) {
            System.out.println((num * 0.35) + " > " + 1000);
        } else if ((num * 35/100) < 1000) {
            System.out.println((num * 0.35) + " < " + 1000);
        } else {
            System.out.println((num * 0.35) + " = " + 1000);
        }

*/
      /*  Scanner input = new Scanner(System.in);
        System.out.println("1-10 qeder reqem yazin");

        int num = input.nextInt();

        for (int i = 1; i < 11; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        */

        /*Scanner input = new Scanner(System.in);
        System.out.println("5eded sayi griniz");

        int sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " eded ");
            int num = input.nextInt();
            sum = sum + num;
        }
        double ave = (double) (sum / 5.0);
        System.out.println("5edein ortalamasi " + ave);
        */

       /* Scanner input = new Scanner(System.in);


        for (int a = 1; a < 11; a++)
        {

            for (int b = 1; b < 11; b++)
            {
               int x = 2*a - b;
                System.out.println("x = " + x + "\ta = " + a + "\tb = " + b);
            }
            System.out.println();
*/

        Scanner input = new Scanner(System.in);
        System.out.println("1-10 kimi reqem yazdiginizda vurma cedveli gelecek");

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");

            }
            System.out.println();
        }

       /* Scanner input = new Scanner(System.in);
        System.out.println("1-10 kimi reqem yazdiqda vurma cedveli gorsenecek");

        int num = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i) + "\t");
        }



/*
        for (int i =0, j = 10; i < 10 && j > 0; i++,j--)
        {
            System.out.println("i = " + i);
            System.out.println("j = " + i);
        }

 */
    }
}


