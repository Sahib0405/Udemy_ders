package Ders04;

import java.util.Scanner;

public class iki_sayi_deyerinin_deyis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("first_num: ");
        int first_num = input.nextInt();

        System.out.print("second_num: ");
        int second_num = input.nextInt();

        System.out.println("Deyisdirilmeden once ");
        System.out.println("first_num = " + first_num + "\t second_num = " + second_num );

        int next_num = first_num;
        first_num = second_num;
        second_num = next_num;

        System.out.println("Deyisdirildikden sonra = ");
        System.out.println("first_num = " + first_num + "\t second_num = " + second_num );
    }
}
