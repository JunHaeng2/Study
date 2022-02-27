package ch9;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1 == p2) {
            System.out.println("같은 사람");
        } else {
            System.out.println("다른 사람");
        }

        if(p1.equals(p2)) {
            System.out.println("같은 사람");
        } else {
            System.out.println("다른 사람");
        }
    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}
