package src;

public class Account {
    private String customer;
    private double balance;

    // Constructor
    public Account(){};

    public Account(String name, double balance) {
        this.customer = name;
        this.balance = balance;
    }

    public void PrintAccount() {
        System.out.println("Account info");
    }

    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account("Bou", 2033.89);
        account.PrintAccount();
    }
}
