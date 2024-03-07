package _02_tipoString;

public class _02_StringConcatenacion {
    public static void main(String[] args) {
        // La concatenacion es algo fundamental existen diferenctes formas de concatenar
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // 1. Usando el operador +
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        // 2. Usando el metodo concat
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
