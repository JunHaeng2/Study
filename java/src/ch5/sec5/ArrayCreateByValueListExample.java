package ch5.sec5;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall"};

        for (int i=0; i < season.length; i++) {
            System.out.println(season[i]);
        }
    }
}
