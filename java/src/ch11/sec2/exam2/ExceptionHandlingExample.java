package ch11.sec2.exam2;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
