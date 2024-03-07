package _01_variables;

public class _03_PrimitivosCaracteres {
    public static void main(String[] args) {
        /*
        Cuando definimos un tipo primitivo char estamos indicando que solo va a ser un elemento, el dato char puede
        escribir con código ASQUI o unicode
        */
        // char es un tipo primitivo de 16 bits

        char caracter = '\u0040'; // @
        char decimal = 64; // @
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
