package ch7;
import java.util.*;

class Product1 {
    int price;
    int bonusPoint;

    Product1(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }

    Product1() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tvv extends Product1 {
    Tvv() {super(100);}
    public String toString() {return "TV";}
}

class Computerr extends Product1 {
    Computerr() {super(200);}
    public String toString() {return "Computer";}
}

class Audio extends  Product1 {
    Audio() {super(50);}
    public String toString() {return "Audio";}
}

class Buyer1 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product1 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "를 구매하셨습니다.");
    }

    void refund(Product1 p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품중에 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for (int i=0; i < item.size(); i++) {
            Product1 p = (Product1) item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }

        System.out.println("구입하신 총 금액은 " + sum);
        System.out.println("구입하신 제품은 " + itemList);
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        Tvv t = new Tvv();
        Computerr c = new Computerr();
        Audio a = new Audio();

        b.buy(t);
        b.buy(c);
        b.buy(a);

        b.summary();

        System.out.println();
        b.refund(t);
        b.summary();
    }
}
