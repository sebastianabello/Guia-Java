package _01_variables;

import javax.swing.*;

public class _05_SistemasNumericos {
    public static void main(String[] args) {

        /*
         En este caso existen 4 sistemas numéricos
            - Decimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            - Binario: 0, 1
            - Octal: 0, 1, 2, 3, 4, 5, 6, 7
            - Hexadecimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
         Integer proporciona métodos para convertir un número decimal a binario, octal y hexadecimal
            .toBinaryString(int i)
            .toOctalString(int i)
            .toHexString(int i)
         */

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
