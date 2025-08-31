package Ders05;

public class MT_practic_03 {

    public static int toplama(int a){
        return a+2;
    }
    public static int vurma(int a){
        return a*2;
    }
    public static int cixma(int a){
        return a-2;
    }

    public static void main(String[] args) {

        System.out.println(cixma(vurma(toplama(5))));
    }
}
