package ch6;

class TV {
    // property

    String color;
    boolean power;
    int channel;

    // method

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvTest1 {
    public static void main(String[] args) {

        // ch6.TV 클래스 타입의 t 객체변수를 생성하고, new에 의해서 TV클래스의 인스턴스가 메모리의 빈 공간에 생성됨
        // 각 자료형에 맞는 기본값으로 초기화된 상태.
        // = 연산자를 통해서 참조변수 t를 통해서 TV의 인스턴스 값에 접근할수있게된 상태 !
        TV t = new TV();

        //
        t.channel = 7;
        t.channelDown();
        t.channelUp();

        System.out.println("현재 채널은 " + t.channel + "입니다.");
        System.out.println(t.power);
    }

}
