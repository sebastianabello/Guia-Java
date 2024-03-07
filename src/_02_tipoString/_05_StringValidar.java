package _02_tipoString;

public class _05_StringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);
        // .isEmpty() es lo mismo que .length() == 0, pero es más legible
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        // .isBlank() es lo mismo que .trim().length() == 0, pero es más legible
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
