package Exercises;
import java.util.Scanner;

public class CreditLimitCalculator {

    private int accountNumber;
    private int balanceAtBeginningOfMonth;
//    private int creditBalance;
    private int totalItemsCharged;
    private int totalCreditToCustomerAccount;
    private int allowedCreditLimit;
    private int charge;
    private int balance;

    public CreditLimitCalculator(int accountNumber, int balanceAtBeginningOfMonth, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
        this.allowedCreditLimit = allowedCreditLimit;
        balance = balanceAtBeginningOfMonth + allowedCreditLimit;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }


    public int getBalanceAtBeginningOfMonth() {
        return balanceAtBeginningOfMonth;
    }

    public void setBalanceAtBeginningOfMonth(int balanceAtBeginningOfMonth) {
        this.balanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalCreditToCustomerAccount() {
        return totalCreditToCustomerAccount;
    }

    public void setTotalCreditToCustomerAccount(int totalCreditToCustomerAccount) {
        this.totalCreditToCustomerAccount = totalCreditToCustomerAccount;
    }


    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }

//    public int calculateBalance() {
//        return getBalanceAtBeginningOfMonth() + getTotalItemsCharged() - getTotalCreditToCustomerAccount();
//    }

    public int creditBalanceCalc() {
        balance -= charge;
        return balance;
    }

    public void setBalance(){

    }

    public void setItem(int item) {

        if(item == 1) {
            charge = 300;
        }
        else if(item == 2) {
            charge = 500;
        }
        else if(item == 3) {
            charge = 800;
        }
    }






    public static void main(String[] args) {
        CreditLimitCalculator creditCalc = new CreditLimitCalculator(201, 1000, 300);
        Scanner input = new Scanner(System.in);

        System.out.printf("New balance on account is %d%n",creditCalc.creditBalanceCalc());
        System.out.println(creditCalc.getBalanceAtBeginningOfMonth());
        System.out.println(creditCalc.getAccountNumber());
        System.out.println(creditCalc.getAllowedCreditLimit());

        System.out.println("Please choose between items 1, 2 and 3");
        creditCalc.setItem(1);
        creditCalc.setItem(2);
        System.out.printf("New balance on account is %d%n",creditCalc.creditBalanceCalc());







    }
}
