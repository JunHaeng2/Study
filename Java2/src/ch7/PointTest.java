package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D d = new Point3D(1,2,3);
        System.out.println(d.getLocation());
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    String getLocation() {
        return "x : " + x + "y : " + "z : ";
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x : " + x + "y : " + y + "z : " + z;
    }

}