package _05_clasesWrapper;

public class _01_Integer {
    public static void main(String[] args) {
        // Clase Wrapper Integer
        Integer numero = 10; // Autoboxing
        int numero2 = numero; // Unboxing
        System.out.println(numero);
        System.out.println(numero2);

        String valorTV = "67000";
        Integer valor = Integer.valueOf(valorTV);
        System.out.println("valor = " + valor);

        Integer intObjeto = numero;
        Short shorObjeto = intObjeto.shortValue();
        System.out.println("shorObjeto = " + shorObjeto);



    }
}
