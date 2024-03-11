package _09_arreglos;

import java.util.Arrays;

public class _02_ejemploArreglosSort {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Audifonos";
        productos[1] = "Teclado";
        productos[2] = "Memoria usb";
        productos[3] = "Monitos";
        productos[4] = "Disco";
        productos[5] = "Parlante";
        productos[6] = "Pantalla 4k";

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);


    }
}
