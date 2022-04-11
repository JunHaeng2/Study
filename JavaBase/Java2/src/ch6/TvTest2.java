package ch6;

class TV1 {
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

public class TvTest2 {
    public static void main(String[] args) {

        // ch6.TV 클래스 타입의 t 객체변수를 생성하고, new에 의해서 TV클래스의 인스턴스가 메모리의 빈 공간에 생성됨
        // 각 자료형에 맞는 기본값으로 초기화된 상태.
        // = 연산자를 통해서 참조변수 t를 통해서 TV의 인스턴스 값에 접근할수있게된 상태 !
        TV1 t1 = new TV1();
        TV1 t2 = new TV1();

        //
        t1.channel = 7;
        t1.channelDown();
        t1.channelUp();

        // 이렇게 하면 t1이 저장하고 있는 주소 값이 t2로 넘어가게 되어서
        // t1과 t2 두개가 같은 주소를 바라보고있다고 생각하면됨.

        // 여러개의 참조변수가 하나의 인스턴스(객체)를 가르키는건 가능하지만
        // 하나의 참조변수가 여러개의 인스턴스(객체)를 가르키는건 불가능하다.
        t2 = t1;

        System.out.println("현재 채널은 " + t1.channel + "입니다.");
        System.out.println("현재 채널은 " + t2.channel + "입니다.");
        System.out.println(t1.power);
    }

}
