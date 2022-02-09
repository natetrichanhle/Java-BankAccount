import java.util.*;

public class BankAccount{
    private double checkingsBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int accounts = 0;
    private static double totalMoney = 0;

    public BankAccount(){
        genAccNumber();
        accounts++;
    }

    public static int accountsCount(){
        return accounts;
    }

    public static double totalBalance(){
        return totalMoney;
    }

    public void deposit(String accountType, double amount){
        if(accountType == "checkings"){
            this.checkingsBalance += amount;
        } else if(accountType == "savings"){
            this.savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(String accountType, double amount){
        if(accountType == "checkings" && getCheckings() >= amount){
            setCheckings(getCheckings() - amount);
            totalMoney -= amount;
        } else if(accountType == "savings" && getSavings() >= amount){
            setSavings(getSavings() - amount);
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void showBalance(){
        System.out.println("This YO MONEY: " + getCheckings() + getSavings());
    }

    private String genAccNumber(){
        Random accNum = new Random();
        this.accountNumber = new String();
        for(int i = 0; i < 10; i++){
            int randomNum = accNum.nextInt(10);
            this.accountNumber += randomNum;
        }
        return this.accountNumber;
    }

    public double getCheckings(){
        return checkingsBalance;
    }

    public void setCheckings(double checkingBalance){
        this.checkingsBalance = checkingBalance;
    }

    public double getSavings(){
        return savingsBalance;
    }

    public void setSavings(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
}