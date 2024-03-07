package _07_clases.System;

import java.util.Properties;

public class _01_propiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.lineSeparator();
        System.out.println("line 1" + lineSeparator + "line 2" + lineSeparator + "line 3");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
