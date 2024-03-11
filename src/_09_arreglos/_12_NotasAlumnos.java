package _09_arreglos;

import java.util.Scanner;

public class _12_NotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMat = 0, sumNotasHist = 0, sumNotasLengu = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese notas de matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese notas de Historia: ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese notas de Lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }


        for (int i = 0; i < 7; i++) {
            sumNotasMat+= claseMatematicas[i];
            sumNotasHist+= claseHistoria[i];
            sumNotasLengu+= claseLenguaje[i];
        }

        System.out.println("Promedio clase matematicas: " + (sumNotasMat/claseMatematicas.length));
        System.out.println("Promedio clase historia: " + (sumNotasHist/claseHistoria.length));
        System.out.println("Promedio clase lenguaje: " + (sumNotasLengu/claseLenguaje.length));

    }
}
