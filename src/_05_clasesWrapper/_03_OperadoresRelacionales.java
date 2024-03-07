package _05_clasesWrapper;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(200);
        Integer num2 = num1;

        //en Java a valores menor a 128 va comparar de forma automática por valor, sin importar que sean instancias diferentes
        // si el valor es mayor a 128, va a comparar por referencia

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("son el mismo objeto? " + (num1 == num2));

        num2 = 200;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //si es menor a 128 se puede usar == para comparar valores
        System.out.println("son el mismo objeto? " + (num1 == num2));

        // si es mayor a 128 se debe usar el método equals para comparar valores
        System.out.println("tienen el mismo valor? " + (num1.equals(num2)));

        // o la otra forma sería con intValue
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));
    }
}
