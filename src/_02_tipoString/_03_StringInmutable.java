package _02_tipoString;

public class _03_StringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // usando el metodo transform, se usa una function lambda para concatenar
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        // reemplazar todas las a por A en el string
        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
