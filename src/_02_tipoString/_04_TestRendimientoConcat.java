package _02_tipoString;

public class _04_TestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        // Podemos hacer testin y probar la velocidad de concatenación de cadenas
        // StringBuilders son más rápidos que concatenar con el operador + o con el método concat
        StringBuilder sb = new StringBuilder(a);


        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
            // c += a + b + "\n"; // 500 => 19, 1000 => 21ms, 10000 => 68, 100000 => 1976ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
        }

        // resultados: StringBuilder es el más rápido, seguido por concat y por último el operador +
        // concat es rapido pero al tener ya un flujo de datos altos se vuelve lento, pero no en modo a mal rendimiento

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
