package _06_valorVsReferencia;

class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public String leerNombre() {
        return this.nombre;
    }
}
public class _03_pasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("sebastian");
        System.out.println("persona = " + persona);
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("antes de llamar el metodo test");
        test(persona);
        System.out.println("despues de llamar el metodo test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el metodo main");



    }
    public static void test(Persona persona1) {
        System.out.println("inicia el metodo test");
        persona1.modificarNombre("Pepe");

        System.out.println("finaliza el metodo test");

    }
}
