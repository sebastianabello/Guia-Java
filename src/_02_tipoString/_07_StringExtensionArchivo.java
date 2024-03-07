package _02_tipoString;

public class _07_StringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.pdf";
        // Se busca un punto y se identifica la extensión del archivo
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
    }
}
