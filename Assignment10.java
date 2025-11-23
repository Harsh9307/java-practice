class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Assignment10 {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        bank1.setAccountNumber("123asdajn4");
        bank1.setBalance(8492489);

        String accountNumber = bank1.getAccountNumber();
        System.out.println("account number is " + accountNumber);

        double balance = bank1.getBalance();
        System.out.println("Balance is =>" + balance);
    }
}
