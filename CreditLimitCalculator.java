package Exercises;
import java.util.Scanner;

public class CreditLimitCalculator {

    private int accountNumber;
    private int balanceAtBeginningOfMonth;
    private int totalItemsCharged;
    private int totalCreditToCustomerAccount;
    public int allowedCreditLimit = 1000;


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

    public int calculateBalance() {
        return getBalanceAtBeginningOfMonth() + getTotalItemsCharged() - getTotalCreditToCustomerAccount();
    }



    public static void main(String[] args) {
//         int accountNumber = 0;
//         int creditLimit = 2000;
//        int balanceAtBeginningOfMonth = 0;
//        int totalItemsChargedAtBeginningOfMonth = 0;
//        int totalCreditsToCustomerAccountThisMonth = 0;

        CreditLimitCalculator creditCalc = new CreditLimitCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer's account number");
        int account = input.nextInt();
        creditCalc.setAccountNumber(account);
        System.out.println("Enter customer's account balance at the beginning of the month");
        int monthBalance = input.nextInt();
        creditCalc.setBalanceAtBeginningOfMonth(monthBalance);
        System.out.println("Enter total items charged to customer's account at beginning of the month");
        int totalItemsCharged = input.nextInt();
        creditCalc.setTotalItemsCharged(totalItemsCharged);
        System.out.println("Enter total credit assigned to customer account this month");
        int totalCreditToCustomerAccount = input.nextInt();
        creditCalc.setTotalCreditToCustomerAccount(totalCreditToCustomerAccount);

        System.out.printf("Customer account is: %d%nCustomer account balance at the beginning of the month is: %d%n" +
                "Total items charged to customer account is: %d%nTotal credit to customer account: %d%nNew balnce on customer account is:", creditCalc.getAccountNumber(),
                creditCalc.getBalanceAtBeginningOfMonth(), creditCalc.getTotalItemsCharged(), creditCalc.getTotalCreditToCustomerAccount(), creditCalc.calculateBalance());

        if(creditCalc.calculateBalance() > allowedCreditlimit) {
            System.out.println("Sorry, you do not have access to anymore credit on your customer acoount");
        } else {
            System.out.println("You are eligible for more credit on your shopping account");
        }





    }
}
