package ch13.sec2.exam2;

public class HomeAgency implements Rentable<Home> {

    @Override
    public Home rent() {
        return new Home();
    }

}
