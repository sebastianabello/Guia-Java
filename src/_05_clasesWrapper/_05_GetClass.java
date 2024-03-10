package _05_clasesWrapper;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class _05_GetClass {
    public static void main(String[] args) {
        String texto = "Hola como estas";
        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass);
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());

        System.out.println("Métodos de la clase String");
        for(Method metodo : strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        Integer num = 10;
        Class intClass = num.getClass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());

        System.out.println("\n\nMétodos de la clase Integer");
        for (Method metodo : intClass.getMethods()) {
            System.out.println("metodo = " + metodo.getName());
        }

    }
}
