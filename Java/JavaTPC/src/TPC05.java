import kr.bit.*;

public class TPC05 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "자바";
        b.price = 15000;
        b.company = "한빛미디어";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);

        Person p = new Person();
        p.age = 10;
        p.height = 170.5f;
        p.name = "인간";
        p.weight = 60.1f;

        System.out.println(p.age);
        System.out.println(p.height);
        System.out.println(p.name);
        System.out.println(p.weight);        
    }       
}
