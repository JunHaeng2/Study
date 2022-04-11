package ch6;

public class BlockTest {

    static {
        System.out.println("클래스 초기화 블럭");
    }

    {
        System.out.println("인스턴스 초기화 블럭");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        BlockTest b = new BlockTest();

        // 클래스 초기화 블럭은 static이기 때문에 main이 실행될때 바로 동작
        // 인스턴스 초기화 블럭은 인스턴스 객체가 생성될때
        // 생성자는 초기화 블록 동작 이후
    }
}
