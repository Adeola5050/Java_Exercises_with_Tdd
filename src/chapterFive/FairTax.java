package chapterFive;

public class FairTax {
    private int taxRate;
    private int expense;

    public void setExpense() {
    }

    public void taxRate() {
    }

    public int getExpense() {

        return expense;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate=taxRate;
    }

    public void setExpense(int expense) {
        this.expense=expense;
    }

    public int calculateTax() {
        return expense * taxRate/ (100);
    }

    public int calculateAccurateTax() {
        return expense * taxRate/(100);
    }
}
