package ch6.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj2 == obj1) {
            System.out.println("같은");
        }
    }
}
