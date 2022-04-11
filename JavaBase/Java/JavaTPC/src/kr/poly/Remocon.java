package kr.poly;

public interface Remocon {

    // 인터페이스는 100% 정의 클래스, 객체를 단독적으로 생성 불가
    // Remocon r = new Remocon(); (X)
    // 그렇기에 재정의 된 클래스가 있는 자식 클래스가 필요함

    // 인터페이스에서는 상수도 정의 가능
    // 인터페이스는 객체를 생성할수 없기 때문에 이렇게 static이 붙여있는거임
    // final -> 값을 수정하지 못하게 하기 위해서, 상수이기 때문에 
    public static final int MAXCH = 100;
    public static final int MINCH = 1;
    
    public abstract void chUp();
    public abstract void chDown();
    public abstract void internet();

}
