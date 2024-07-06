public class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 2.0;
    private static final double MAX_WITHDRAWAL_LIMIT = 1000.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= MAX_WITHDRAWAL_LIMIT && (balance - amount - WITHDRAWAL_FEE) >= 0) {
            balance -= (amount + WITHDRAWAL_FEE);
        }
    }
}
