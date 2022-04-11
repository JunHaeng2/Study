package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D1 c1 = new Point3D1();

        System.out.println(c1.x + c1.y + c1.z);
    }
}

class Point1 {
    int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D1 extends Point1 {
    int z;

    Point3D1() {
        this(100, 200, 300);
    }

    Point3D1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
