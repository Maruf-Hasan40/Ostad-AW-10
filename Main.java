public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000.0);
        CheckingAccount checking = new CheckingAccount(500.0);

        System.out.println("Initial Savings Balance: " + savings.getBalance());
        System.out.println("Initial Checking Balance: " + checking.getBalance());

        savings.deposit(200.0);
        checking.deposit(300.0);

        System.out.println("Savings Balance after deposit: " + savings.getBalance());
        System.out.println("Checking Balance after deposit: " + checking.getBalance());

        savings.withdraw(150.0);
        checking.withdraw(600.0);

        System.out.println("Savings Balance after withdrawal: " + savings.getBalance());
        System.out.println("Checking Balance after withdrawal: " + checking.getBalance());
    }
}
