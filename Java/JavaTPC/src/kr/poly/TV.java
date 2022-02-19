package kr.poly;

public class TV implements Remocon {

    int currCH = 70;
    
    @Override
    public void chUp() {
        if(currCH < Remocon.MAXCH) {
            currCH++;
            System.out.println("Tv의 채널이 올라간다." + currCH);
        } else {
            currCH = 0;
        }
    }

    @Override
    public void chDown() {
        if(currCH > Remocon.MINCH) {
            currCH--;
            System.out.println("Tv의 채널이 내려간다." + currCH);
        } else {
            currCH = 100;
        }
    }

    @Override
    public void internet() {
        System.out.println("인터넷이 된다..");
    }
}
