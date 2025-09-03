package Ders05;

import java.util.Scanner;

public class Mt_proje03_makine {
    public static int cixma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int vurma(int a, int b) {
        return a * b;
    }

    public static int vurma(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        String funksiyalar = "1. Vurma \n"
                + "2. Toplama \n"
                + "3. Bolme \n"
                + "4. Cixma \n"
                + "Cixis ucun q-ni klik edin";
        System.out.println("********************");
        System.out.println(funksiyalar);
        System.out.println("********************");

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Funksiyani secin: ");
            String funksiya = input.nextLine();

            if (funksiya.equals("q")) {
                System.out.println("Programdan cixildi.");
                break;
            } else if (funksiya.equals("1")) {
                System.out.print("Nece deyer vurmaq isteyirsiniz ? (2 veya 3) ");
                int necesayi = input.nextInt();
                if (necesayi == 2) {
                    System.out.println("a: ");
                    int a = input.nextInt();
                    System.out.println("b: ");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("Yazilan saylarin cemi: " + (vurma(a, b)));
                } else if (necesayi == 3) {
                    System.out.println("a: ");
                    int a = input.nextInt();
                    System.out.println("b: ");
                    int b = input.nextInt();
                    System.out.println("c: ");
                    int c = input.nextInt();
                    input.nextLine();
                    System.out.println("Yazilan sayilarin cemi: " + (vurma(a, b, c)));
                } else {
                    System.out.println("Uygun metod deyil");
                }

            } else if (funksiya.equals("2")) {
                System.out.println("Nece deyer toplamaq isteyirsiniz ? (2 veya 3) ");
                int necesayi = input.nextInt();
                if (necesayi == 2) {
                    System.out.println("a: ");
                    int a = input.nextInt();
                    System.out.println("b: ");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("Yazilan saylarin cemi: " + (toplama(a, b)));
                } else if (necesayi == 3) {
                    System.out.println("a: ");
                    int a = input.nextInt();
                    System.out.println("b: ");
                    int b = input.nextInt();
                    System.out.println("c: ");
                    int c = input.nextInt();
                    input.nextLine();
                    System.out.println("Yazilan sayilarin cemi: " + (toplama(a, b, c)));
                } else {
                    System.out.println("Uygun metod deyil");
                }
            } else if (funksiya.equals("3")) {
                System.out.println("Yalniz iki deyer gire bilersiniz");
                System.out.println("a: ");
                int a = input.nextInt();
                System.out.println("b: ");
                int b = input.nextInt();
                input.nextLine();
                System.out.println("Yazilan sayilarin ferqi: " + (bolme(a, b)));
            } else if (funksiya.equals("4")) {
                System.out.println("Yalniz iki deyer gire bilersiniz");
                System.out.println("a: ");
                int a = input.nextInt();
                System.out.println("b: ");
                int b = input.nextInt();
                input.nextLine();
                System.out.println("Yazilan sayilarin ferqi: " + (cixma(a, b)));
            } else {
                System.out.println("Gosterilen reqemlere uygun fuksiya cagirin");
            }

        }

    }
}
