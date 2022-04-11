package ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메세지 + " + e.getMessage());
            e.printStackTrace();
        } catch(MemoryException me) {
            System.out.println("에러 메세 지 + " + me.getMessage());
            me.printStackTrace();
            System.gc();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(enoughMemoey()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }
    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemoey() {
        return true;
    }

}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
