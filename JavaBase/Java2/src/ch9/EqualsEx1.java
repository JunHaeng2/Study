package ch9;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1, v2 같다");
        } else {
            System.out.println("v1, v2 다르다");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1, v2 같다");
        } else {
            System.out.println("v1, v2 다르다");
        }
    }
}

class Value {
    int value;

    Value(int vlaue) {
        this.value = value;
    }
}


