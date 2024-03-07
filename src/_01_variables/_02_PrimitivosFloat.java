package _01_variables;

public class _02_PrimitivosFloat {
    public static void main(String[] args) {

        /*
        para determinar que un número es float, es decir que tiene puntos, toca ponerle al final una f
        por defecto los valores decimales son doble, por eso en el double no colocamos nada

        La diferencia entre float y double es que double es para mayor precision en los datos(mayor grado de decimales)
        */
        float realFloat = 0.00000000015f; //1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
