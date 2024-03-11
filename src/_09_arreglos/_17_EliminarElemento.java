package _09_arreglos;

import java.util.Scanner;

public class _17_EliminarElemento {
    public static void main(String[] args) {
        
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }
        System.out.println("Ingrese la posicion a eliminar (0 a 9)");
        int posicion = s.nextInt();

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(i+ "=> " + a[i]);
        }
    }
}
