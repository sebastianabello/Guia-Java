package _01_variables;

public class _07_ConversionDeTipos {
    public static void main(String[] args) {

        // normamente se tiene que hacer la conversión de tipos de datos
        // de manera explicita, ya que Java no hace conversiones implicitas
        // entre tipos de datos.
        // para convertir un String en int, double, float, etc. se utiliza el método parse de la clase correspondiente
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // existen algo llamado casting, que es la conversión de un tipo de dato a otro
        // en algunos casos se puede hacer de manera implicita, pero en otros casos se tiene que hacer de manera explicita
        // por ejemplo, si se quiere convertir un tipo de dato de mayor capacidad a uno de menor capacidad, se tiene que hacer de manera explicita
        // ya que se puede perder información
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
