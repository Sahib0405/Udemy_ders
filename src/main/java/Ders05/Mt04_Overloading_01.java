package Ders05;

public class Mt04_Overloading_01 {

    public static void toplama (String a, String b){
        System.out.println(a + " " + b);
    }

    public static void toplama(int a, int b) {
        System.out.println("Cemi: " + (a + b));
    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Cemi: " + (a + b + c));
    }

    public static void main(String[] args) {

        toplama(3, 4, 5);
        toplama(5, 10);
        toplama("Xelilov Sahib", "Memmedov Memmed");


    }
}
