package ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if( f instanceof Unit1) {
            System.out.println("hello");
        }

        if( f instanceof Fightable) {
            System.out.println("hello");
        }

        if( f instanceof  Movable) {
            System.out.println("hello");
        }

        if( f instanceof  Attackable) {
            System.out.println("hello");
        }
    }
}

class Fighter extends Unit1 implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit1 u) {}
}

class Unit1 {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit1 u);}
