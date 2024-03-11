package _09_arreglos;

public class _06_ordenamientoBurbuja {

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total / 2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Audifonos", "Teclado", "Memoria usb", "Monitos", "Disco", "Parlante", "Pantalla 4k"};
        int total = productos.length;

        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        System.out.println("--------------for ordenado sin sort------------");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }


        contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        System.out.println("--------------for ordenado sin sort------------");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
