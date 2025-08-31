package Ders05;

public class Mt03_Deyer_donduren_natural {
    public static boolean natural(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {
            if (natural(i)) {
                System.out.println(i);
            }

        }

    }


}