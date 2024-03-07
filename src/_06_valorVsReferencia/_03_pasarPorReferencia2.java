package _06_valorVsReferencia;

public class _02_pasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};
        System.out.println("inicia el metodo main");
        for (int i: edad) {
            System.out.println("edad = " + i);
        }
        System.out.println("antes de test");
        test(edad);
        System.out.println("Despues de test");
        for (int i: edad) {
            System.out.println("edad = " + i);
        }
        System.out.println("Finaliza metodo main");

    }
    public static void test(int[] edadArr) {
        System.out.println("inicia el metodo test");
        for (int i=0; i<edadArr.length; i++) {
           edadArr[i] = edadArr[i] + 5;
        }

        System.out.println("finaliza el metodo test");

    }
}
