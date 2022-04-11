package ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 제품을 구매할수없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Tv2 tv = new Tv2();
        Computer c = new Computer();

        b.buy(tv);
        b.buy(c);

        System.out.println("현재 남은 돈은" + b.money);
        System.out.println("현재 남은 보너스포인트는" + b.bonusPoint);
    }
}
