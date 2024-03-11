package _09_arreglos;

import java.util.Scanner;

public class _13_BuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese una palabra: ");
            a[i] = s.next();
        }
        System.out.print("\r\nIngrese una palabra a buscar: ");
        String palabra = s.next();
        int i = 0;
        while(i< a.length && !a[i].equalsIgnoreCase(palabra)){
            i++;
        }
        if(i == a.length){
            System.out.println("Palabra no encontrado");
        } else if (a[i].equalsIgnoreCase(palabra)) {
            System.out.println("Palabra encontrado en la posicion: " + i);
        }
    }
}
