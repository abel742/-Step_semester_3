class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Problem3BankAccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(1500);
        System.out.println("After withdrawal: " + account.getBalance());

        account.withdraw(10000);
        System.out.println("Final balance: " + account.getBalance());
    }
}