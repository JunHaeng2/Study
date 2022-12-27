package ch12.sec8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
    }
}
