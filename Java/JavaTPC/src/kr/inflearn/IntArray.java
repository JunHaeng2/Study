package kr.inflearn;

public class IntArray {
    private int count;
    private int[] arr;

    public IntArray() {
        // 혹시 누가 data의 길이를 안넣어주면, 알아서 생성자에다가 10을 넣어주기위해
        // 기본값이 10이라는 소리임..
        this(10);
    }

    public IntArray(int init) {
        arr = new int[init];
    }

    public void add(int data) {
        arr[count++] = data;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return count;
    }
}
