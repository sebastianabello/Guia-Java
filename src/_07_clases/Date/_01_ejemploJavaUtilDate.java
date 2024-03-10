package _07_clases.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _01_ejemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        //Formatos de fecha:

        // año-mes(int)-dia
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // dia-mes(String-inicial)-año
        df = new SimpleDateFormat("dd-MMM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // dia-mes(String-completo)-año
        df = new SimpleDateFormat("dd-MMMM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // día de la semana, día de mes de año
        df = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // año-mes-dia hora:minutos:segundos
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        // año-mes-dia hora:minutos:segundos am/pm
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
