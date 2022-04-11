package ch9;

class Circle1 implements Cloneable {
    Point p;
    double r;

    Circle1(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle1 deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }

        Circle1 c = (Circle1) obj;
        c.p = new Point(this.p.x, this.p.y);

        return c;
    }
}


class Point1 {
    int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
}

public class CloneEx2 {
}
