package _09_arreglos;

import java.util.Scanner;

public class _11_paresImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;

        int totalPares = 0, totalImpares = 0;

        a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("-----------pares-----------");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Pares = " + pares[i]);
        }

        System.out.println("-----------impares-----------");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("Impares = " + impares[i]);
        }

    }
}
