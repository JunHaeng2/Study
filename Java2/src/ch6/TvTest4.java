package ch6;

public class TvTest4 {
    public static void main(String[] args) {

        // 객체를 저장하기 위한 틀을 만들었다고 생각하면됨
        TV[] tvArr = new TV[3];

        for(int i = 0; i < tvArr.length; i++) {

            // 만들어진 틀에다가 객체를 만들어서 저장한다고 생각하면 된다.
            tvArr[i] = new TV();
            tvArr[i].channel = i + 10;
        }

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
        }
    }
}
