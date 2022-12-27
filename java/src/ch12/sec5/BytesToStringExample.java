package ch12.sec5;

import java.util.Arrays;

public class BytesToStringExample {
    public static void main(String[] args) throws Exception {
        String data = "자바";

        byte[] arr1 = data.getBytes();
        System.out.println("arr1 : " + Arrays.toString(arr1));

        String str1 = new String(arr1);
        System.out.println(str1);
    }
}
