package _07_clases.System;

public class _05_EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            try {
                process = rt.exec("notepad");
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            try {
                process = rt.exec("gedit");
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Sistema operativo no soportado");
        }
    }
}
