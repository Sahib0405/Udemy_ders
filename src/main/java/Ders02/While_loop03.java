package Ders02;

import java.util.Scanner;

public class While_loop03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_istifadeci_adi = "Xelilov Sahib";
        String sys_parol = "123456";

        System.out.println("**************************");
        System.out.println("Istifadeci girisine xos geldiniz");
        System.out.println("**************************");

        while (true) {
            System.out.print("Istifadeci adi : ");
            String istifadeci = input.next();
            System.out.print("Parol : ");
            String parol = input.next();

            if (istifadeci.equalsIgnoreCase(sys_istifadeci_adi) && parol.equalsIgnoreCase(sys_parol)) {
                System.out.println("Xos geldiniz, " + istifadeci);
                break;
            } else if (istifadeci.equals(sys_istifadeci_adi) && !parol.equals(sys_parol)) {
                System.out.println("Parolunuz yanlis");
                giris_hakki -= 1;
                System.out.println("Giris hakki " + giris_hakki);
            } else if (!istifadeci.equalsIgnoreCase(sys_istifadeci_adi) && parol.equalsIgnoreCase(sys_parol)) {
                System.out.println("Istifadeci adiniz yanlis");
                giris_hakki -= 1;
                System.out.println("Giris hakki " + giris_hakki);
            } else {
                System.out.println("Istifadci adiniz ve parolunuz yanlis");
                giris_hakki -= 1;
                System.out.println("Giris hakki " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giris haqqiniz bitti");
                break;
            }

        }
    }

}