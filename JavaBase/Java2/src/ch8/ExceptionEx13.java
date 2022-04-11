package ch8;

public class ExceptionEx13 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    public static void method1() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
