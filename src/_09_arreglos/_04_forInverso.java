package _09_arreglos;

import java.util.Arrays;

public class _04_forInverso {
    public static void main(String[] args) {
        String[] productos = {"Audifonos","Teclado","Memoria usb","Monitos","Disco","Parlante","Pantalla 4k"};
        int total = productos.length;


        /*
        productos[0] = "Audifonos";
        productos[1] = "Teclado";
        productos[2] = "Memoria usb";
        productos[3] = "Monitos";
        productos[4] = "Disco";
        productos[5] = "Parlante";
        productos[6] = "Pantalla 4k";
         */

        Arrays.sort(productos);

        System.out.println("--------------for------------");
        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("--------------for inverso------------");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println("--------------for inverso 2------------");
        for (int i = total-1; i >= 0 ; i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }

    }
}
