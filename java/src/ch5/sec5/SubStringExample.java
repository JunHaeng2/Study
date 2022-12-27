package ch5.sec5;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstName = ssn.substring(0, 6);
        String secondName = ssn.substring(7);

        System.out.println(firstName);
        System.out.println(secondName);
    }
}
