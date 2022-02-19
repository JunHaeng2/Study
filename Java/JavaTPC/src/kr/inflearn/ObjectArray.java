package kr.inflearn;

public class ObjectArray {
    private int count;
    // 모든 객체를 넣을수 있는 객체이다.
    private Object[] arr;

    public ObjectArray() {
        this(10);
    }

    public ObjectArray(int init) {
        arr = new Object[init];
    }

    public void add(Object data) {
        arr[count++] = data;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int size() {
        return count;
    }
}
