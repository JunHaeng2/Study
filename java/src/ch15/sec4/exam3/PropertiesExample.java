package ch15.sec4.exam3;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.load(PropertiesExample.class
                .getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");

    }
}
