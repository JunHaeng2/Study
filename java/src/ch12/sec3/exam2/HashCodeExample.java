package ch12.sec3.exam2;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()) {
            if(s1.equals(s2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else {
            System.out.println(3);
        }
    }
}
