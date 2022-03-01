package ch11;

import java.util.*;

public class PropertiesEx1 {
    public static void main(String[] args) {

        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()) {
            String element = (String)e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20");

        prop.list(System.out);
    }
}
