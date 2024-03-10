package _07_clases.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _02_EjemploDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese una fecha con formato dd-MM-yyyy: ");
        try {
            Date fecha = sdf.parse(s.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("sdf.format() = " + sdf.format(fecha));

            Date fecha2 = new Date();
            if(fecha.after(fecha2)) {
                System.out.println("fecha es después que fecha2");
            } else if(fecha.before(fecha2)) {
                System.out.println("fecha es antes que fecha2");
            } else if(fecha.equals(fecha2)) {
                System.out.println("fecha es igual que fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
