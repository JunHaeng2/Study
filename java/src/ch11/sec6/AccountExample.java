package ch11.sec6;

import ch9.sec2.exam2.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100000);
        System.out.println("예금액 " + account.getBalance());

        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
