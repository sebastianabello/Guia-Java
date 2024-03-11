package _09_arreglos;

import java.util.Arrays;

public class _03_recorrerArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Audifonos";
        productos[1] = "Teclado";
        productos[2] = "Memoria usb";
        productos[3] = "Monitos";
        productos[4] = "Disco";
        productos[5] = "Parlante";
        productos[6] = "Pantalla 4k";

        int total = productos.length;
        //Arrays.sort(productos);

        System.out.println("--------------for------------");
        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("------------forearch------------");
        for (String prod: productos){
            System.out.println(prod);
        }
        System.out.println("------------while------------");
        int i = 0;
        while(i<total){
            System.out.println(productos[i]);
            i++;
        }
        System.out.println("------------do-while------------");
        int j = 0;
        do {
            System.out.println(productos[j]);
            j++;
        }while(j<total);

        int[] numeros = new  int[10];
        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k*3;
        }
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros[k] = " + numeros[k]);
        }

    }
}
