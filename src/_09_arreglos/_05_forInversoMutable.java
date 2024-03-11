package _09_arreglos;

import java.util.Arrays;
import java.util.Collections;

public class _05_forInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total/2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = {"Audifonos","Teclado","Memoria usb","Monitos","Disco","Parlante","Pantalla 4k"};
        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("--------------for------------");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }

    }
}
