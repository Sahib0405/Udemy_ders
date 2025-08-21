package Ders02;

import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {

         /* int[] numbers = {10, 3, 2, 5, 17};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] > max){
              max = numbers[i];

          }
        }
        System.out.println("En boyuk eded: " + max);
        */

        /* int[] numbers = {10, 3, 2, 5, 17};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];

            }
        }
        System.out.println("En kicik eded: " + min);
        */

        /* System.out.println("1-10 qeder ededler ve onlarin kvadratlari");

        for (int i = 1; i < 11; i++) {
            int kvadrat = i * i;
            System.out.println(i + " ededin kvadrati: " + kvadrat);
        }
         */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Istediyin bir reqemi yaz faktoriyalin tapaq");
        int num = input.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= num; i++) {
            faktoriyel *= i;
        }
        System.out.println(num + " = " + faktoriyel);
        */

       /* System.out.println("1-100 tek ededleri ekrana yazdiraq");

        for (int i = 1; i <= 100; i+=2) {

                System.out.println(i);
            }
*/
       /* Scanner input = new Scanner(System.in);
        System.out.println("n ededini daxil et");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("1-den " + n + "-e qeder cem: " + sum);

*/
    /*    int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum += i;
            System.out.println("1-den = " + n + " N-qeder " + sum);
        }
*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("N - qeder reqemleri daxil et");
        int n = input.nextInt();

        int sum = (n * (n + 1)) /2;
        System.out.println("1den = " + n + " N-qeder = " + sum);

         */

        /*int num = 6;
        int faktoriyal = 1;

        for (int i = 1; i <= num; i++) {

            System.out.println("Faktoriyal = " + i + ": " + faktoriyal + " x " + i + " = " + (faktoriyal * i));
            faktoriyal *= i;
        }
        System.out.println(num + " Faktoriyal = " + faktoriyal);

         */

        /*int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("sum = " + sum);
            sum +=i;
        }
        System.out.println(sum);

        int a = 123;

        if (99 < a && a < 1000){
            System.out.println("us basamaklidir");
        } else {
            System.out.println("Deyildir");
        }
            */

        int a = 12, b = 11, c =10;

        if (a > b && a > c){

            
            System.out.println("a " + "Boyukdur ");
        }

        




    }
}
