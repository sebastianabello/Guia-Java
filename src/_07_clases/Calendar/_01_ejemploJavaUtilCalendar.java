package _07_clases.Calendar;

import java.util.Calendar;
import java.util.Date;

public class _01_ejemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2020, Calendar.JANUARY, 1, 10, 20, 30);

        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.AUGUST);
        calendario.set(Calendar.DAY_OF_MONTH, 15);
        calendario.set(Calendar.HOUR_OF_DAY, 15);
        calendario.set(Calendar.MINUTE, 30);
        calendario.set(Calendar.SECOND, 45);


        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
