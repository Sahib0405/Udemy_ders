package Ders02;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        System.out.println("0-100 arasi reqemleri girin");

        int num = input.nextInt();


        if (num >= 0 && num <= 100 ) {
            System.out.println("Uygundur " );

        }

        else {
            System.out.println("Uygun deyil ");
        }
        */

       /* Scanner input = new Scanner(System.in);

        System.out.print("0 kicik ve 100 boyuk reqemleri giriniz ");

        short num = input.nextShort();

        if (num < 0 || num > 100)
        {
            System.out.println("Uygundur");
        }
        else
        {
            System.out.println("Uygun deyil");
        }
        */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Xahis edirem hansi gun oldugunu giriniz");

        //double numDouble = input.nextDouble();

        int num = input.nextInt();

        if (!= num) {
            System.out.println("Lutfen bir tamsayi giriniz");

        }else {
            if (num <= 0) { //num < 1; de yazabilirdim
                System.out.println("Gun sayilari 1'den kucuk olamaz");
            } else if (num == 1) {
                System.out.println("Pazar");
            } else if (num == 2) {
                System.out.println("Pazartesi");
            } else if (num == 3) {
                System.out.println("Sali");
            } else if (num == 4) {
                System.out.println("Carsamba");
            } else if (num == 5) {
                System.out.println("Persembe");
            } else if (num == 6) {
                System.out.println("Cuma");
            } else if (num == 7) {
                System.out.println("Cumartesi");
            } else {
                System.out.println("Gun sayilari 7'den buyuk olamaz");

        */



          /* Scanner input = new Scanner(System.in);

        System.out.println("1ci reqemi daxil edin");
        int a = input.nextInt();

        System.out.println("2ci reqemi daxil edin");
        int b = input.nextInt();

        boolean c = a > b;
       // boolean d = a < b;

        if (a > b){
            System.out.println(c);
        }
        else {
            System.out.println(c);
        } input.close();

        */
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Consuldan bir reqem giriniz");


        int a = input.nextInt();


        if (a < 0){
            System.out.println("soyuq");
        } else if (a > 0 && a < 15){
            System.out.println("iliq");
        } else {
            System.out.println("Isti ");
        }

        */

        /*Scanner input = new Scanner(System.in);

        System.out.println("Konsula 1ci reqemi yazin");
        int x = input.nextInt();

        System.out.println("Konsula 2ci reqemi yazin");
        int y = input.nextInt();

        if (x > 0 && y < 100000) {
            System.out.println("X ve Y arasinda ki sayilar");
        }
        */
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("1ci reqemi giriniz");
        int num1 = input.nextInt();

        System.out.println("2ci reqemi giriniz");
        int num2 = input.nextInt();

        System.out.println("3cu reqemi giriniz");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2 ) {
            System.out.println(num3);
        }
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz");
        int weight = input.nextInt();
        System.out.println("Boyunuzu giriniz");
        double height = input.nextDouble();

        double bki = (weight / (height * height));

        if (bki < 18.5){
            System.out.println("Zeifsiniz " + bki);
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normalsiniz " + bki);
        } else if (bki > 25 && bki < 30) {
            System.out.println("Artiq kilolusunuz " + bki);
        } else {
            System.out.println("Obezsiniz " + bki);
        }

    }
}
