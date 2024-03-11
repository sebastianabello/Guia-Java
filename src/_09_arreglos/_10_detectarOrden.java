package _09_arreglos;

import java.util.Scanner;

public class _10_detectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]){
                descendente = true;
            }
            if (a[i] < a[i+1]){
                ascendente = true;
            }
        }
        if (descendente && ascendente) {
            System.out.println("Arreglo = desordenado");
        }
        if (!descendente && !ascendente) {
            System.out.println("Arreglo = Todos son iguales");
        }
        if (ascendente && !descendente) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        }
        if (!ascendente && descendente) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }


    }
}
