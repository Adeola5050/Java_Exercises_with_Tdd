package chapterEight;

public class SavingAccount {
    private double savingBalance;
    private double annualInterest;

    public void setSavingBalance(double savingBalance) {

        this.savingBalance = savingBalance;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public double getSavingBalance() {
        return savingBalance;
    }


//where annual interest rate 4% of 1000.00 = 1000.00 *4/100= 40.00
    public double getAnnualInterest() {
        return annualInterest;
    }

    public double calculateMonthlyInterest() {
        return getSavingBalance() * (getAnnualInterest() / (12));
    }

    }


