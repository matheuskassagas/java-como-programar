package com.company.entities.Interface.DefaultMethod;

public class brazilInterestService implements InterestService{

    private double interestRate;


    public brazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
