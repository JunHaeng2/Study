package ch8;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTemFiles();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            deleteTemFiles();
        }
    }

    static void startInstall() {

    }

    static void copyFiles() {

    }

    static void deleteTemFiles() {

    }
}
