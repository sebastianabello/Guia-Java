package _07_clases.System;

import java.util.Map;

public class _04_ejemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + getenv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = getenv.get("PATH");

        String homeDrive = getenv.get("HOMEDRIVE");
        System.out.println("homeDrive = " + homeDrive);

        System.out.println("Listando variables de ambiente del sistema");
        for (String key : getenv.keySet()) {
            System.out.println(key + " = " + getenv.get(key));
        }
    }
}
