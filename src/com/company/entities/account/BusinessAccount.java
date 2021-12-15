package com.company.entities.account;

import com.company.entities.account.Account;

public final class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if(amount > loanLimit){
            System.out.println("Valor não liberado");
        }else{
            deposit(amount);
        }
    }

    @Override
    public final void withDraw(double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }
}
