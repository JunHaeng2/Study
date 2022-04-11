package ch8;

public class ExceptionEx14 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch(Exception e) {
            System.out.println("메인 메소드에서 에러를 잡았다.");
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        throw new Exception();
    }
}
