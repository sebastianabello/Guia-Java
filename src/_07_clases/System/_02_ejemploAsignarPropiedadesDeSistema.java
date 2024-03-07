package _07_clases.System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _02_ejemploAsignarPropiedadesDeSistema {


    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/_07_clases/System/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(fis);
            p.setProperty("mi.Propiedad", "mi Valor guardada en objeto properties");
            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
