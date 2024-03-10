package _06_valorVsReferencia;

public class _01_pasarPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("inicia x  = " + x);
        test(x);
        System.out.println("finaliza x = " + x);
    }
    public static void test(int x) {
        System.out.println("Inicio metodo test con i = " + x);
        x = 35;
        System.out.println("finaliza con i = " + x);
    }
}
