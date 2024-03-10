package _05_clasesWrapper;

public class _02_AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;
        for (Integer entero : enteros) {
            if ((entero % 2) == 0) {
                suma += entero;
            }
        }
        System.out.println("suma = " + suma);
    }
}
