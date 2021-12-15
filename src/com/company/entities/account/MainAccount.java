package com.company.entities.account;



public class MainAccount {

    public static void main(String[] args) {


        BusinessAccount bacc = new BusinessAccount(1901, "Maria", 0.0, 500.00);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
