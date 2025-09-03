package Ders05;

public class MT_practic_09 {
    public static void vurmaCedveli() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vurmaCedveli();
    }
}
