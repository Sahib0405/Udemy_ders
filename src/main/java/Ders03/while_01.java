package Ders03;

import java.util.Scanner;

public class while_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int giris_haqqi = 3;
        String sys_istifadeci_adi = "Xelilov Sahib";
        String sys_parol = "123456";
        System.out.println("************************");
        System.out.println("Istifadeci girisine xos geldiniz.");
        System.out.println("*************************");

       while (true){
           System.out.print("Istifadeci adi: ");
           String istifadeci = input.nextLine();
           System.out.print("Parol: ");
           String parol = input.nextLine();

           if (istifadeci.equals(sys_istifadeci_adi) && parol.equals(sys_parol)){
               System.out.println("Xos geldiniz, " + istifadeci);
               break;
           }
           else if (istifadeci.equals(sys_istifadeci_adi) && !parol.equals(sys_parol)) {
               System.out.println("Parolunuz yanlisdir...");
               giris_haqqi = giris_haqqi -1;
               System.out.println("Gisis haqqi " + giris_haqqi);
           }
           else if (!istifadeci.equals(sys_istifadeci_adi) && parol.equals(sys_parol)) {
               System.out.println("Istifadeci adiniz yanlisdir");
               giris_haqqi = giris_haqqi -1;
               System.out.println("Gisis haqqi " + giris_haqqi);
           }
           else {
               System.out.println("Parolunuz ve istifadeci adiniz yanlisdir");
               giris_haqqi = giris_haqqi -1;
               System.out.println("Gisis haqqi " + giris_haqqi);
           }
            if (giris_haqqi == 0){
               System.out.println("Gisis haqqiniz bitti, yeniden cehd edin");
               break;
           }
       }


    }
}
