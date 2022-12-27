package ch15.sec6.exam1;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();
        coinBox.push(new Coin(100));
        coinBox.push((new Coin(50)));

        while (!coinBox.empty()) {
            Coin coin = coinBox.pop();
            System.out.println(coin.getValue());
        }
    }
}
