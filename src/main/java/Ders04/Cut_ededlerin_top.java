package Ders04;

public class Cut_ededlerin_top {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.print("Sayi yazin: ");

        int num = input.nextInt();

        int sum = 0;


        for (int i = 0; i <= num; i += 2) {
            System.out.println(i);
            sum += i;

        }
        System.out.println("Cut edelerin cemi = " + sum);*/


        int sum = 0;

        for (int i = 1; i <= 10; i ++)
        {
            if (i == 5)
            {
                continue;
            }
            System.out.println(i);
            sum += i;
        }
        System.out.println("5Xaric 1-10 arasi cem = " + sum);
    }

}

