package Ders05;

public class Mt04_Overloading_02 {
    public static void main(String[] args) {
        skorhesabla("Sahib" , 50);
        skorhesabla("Ferhad");
        skorhesabla(2000);
    }
    public static void skorhesabla(String ad, int puan){
        System.out.println(ad + " adli oyuncunun " + puan + " puani var");
    }
    public static void skorhesabla(int puan){
        System.out.println("Adsiz oyuncunun " + puan + " puani var");
    }
    public static void skorhesabla(String ad){
        System.out.println(ad + " adli oyuncunun puani yox");
    }
}
