// Homework:
// provide appropriate get and set methods
// modify printAccount as appropriate

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
        System.out.println("Account Info");
        System.out.println("Customer: " + this.customer);
        System.out.println("Balance: " + this.balance + "\n");
    }

    public void setCustomer(String name) {
        this.customer = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setCustomer("Gregory");
        account.setBalance(8.92);

        Account account1 = new Account("Bou", 2033.89);
        System.out.println(account1.getCustomer());
        System.out.println(account1.getBalance() + "\n");

        account.PrintAccount();
        account1.PrintAccount();
    }
}
