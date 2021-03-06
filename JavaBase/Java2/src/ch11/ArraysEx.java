package ch11;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.toString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println(Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6) + 1);
        System.out.println(Arrays.toString(arr7));

        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);

        }
    }
}
