package ch9;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = (Integer) i;
        Object obj = (Object) i;

        Long lng = 100L;

        int i2 = intg + 100;
        long l = lng + intg;

//        Integer intg2 = new Integer(20);

//        int i3 = (int)intg2;

    }
}
