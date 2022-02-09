public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.deposit("checkings", 42069);
        account1.showBalance();

        account2.deposit("savings", 69420);
        account2.withdraw("savings", 420);

        System.out.println(BankAccount.accountsCount());
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}
