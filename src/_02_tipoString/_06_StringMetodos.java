package _02_tipoString;

public class _06_StringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length()); // 6
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // ANDRES
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // andres
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); // true
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres")); // false
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // 0
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); // > 0
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // A
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // n
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); // s

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // ndres
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // ndr
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2)); // es

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", ".")); // tr.b.lengu.s
        System.out.println("trabalenguas = " + trabalenguas); // trabalenguas
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // 1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // 10
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas")); // 5
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas")); // true
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); // true
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s")); // true
        System.out.println("  trabalenguas "); // se imprime con espacios
        System.out.println("  trabalenguas ".trim()); // trabalenguas
        
    }
}
