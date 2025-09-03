package Ders05;

public class Mt_practic_11 {

    public static String kiloBoy (double height, double weight){
        double ferq = weight - height;
        if (ferq <= 10){
            return "Normal";
        } else {
            return "Yuksek";
        }

    }

    public static void main(String[] args) {
        double height = 1.85;
        double weight = 90;
        String netice = kiloBoy(height,weight);
        System.out.println("Netice: " + netice);
    }
}
