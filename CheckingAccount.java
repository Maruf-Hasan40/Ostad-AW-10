public class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
            balance -= amount;
        }
    }
}
