package _02_tipoString;

public class _01_String {
    public static void main(String[] args) {
        //Existen dos formas de crear un String en Java
        //1. Declarando una variable de tipo String y asignando un valor
        String curso = "Programación Java";
        //2. Creando un objeto de tipo String
        String curso2 = new String("Programación Java");

        //Para comparar si dos string son iguales no podemos usar (==), ya que compara las referencias de memoria
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //Para comparar si dos string son iguales debemos usar el método equals
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
