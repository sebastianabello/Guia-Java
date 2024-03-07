package _04_flujosDeControl;

import java.util.Scanner;

public class _03_SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes entre 1 - 12:");
        int mes = s.nextInt();
        String nombreMes = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Indefinido";
        };

        System.out.println("nombreMes = " + nombreMes);
        
        char num = '1';

        switch(num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "juan";

        switch(nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola andres!");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }

        
    }
}
