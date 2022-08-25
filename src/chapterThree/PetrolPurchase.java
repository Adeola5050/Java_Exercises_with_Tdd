package chapterThree;

public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int quantity;
    private int liter;
    private double price;


    public void setLiter(int liter) {
        this.liter= liter;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public int getLiter(int liter) {
        return liter;
    }

    public double getPrice(double price) {
        return price;
    }

    public double calculateAmountPurchased() {

        return liter * price * quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;

    }

    public void setPurchaseAmount(double purchaseAmount) {

    }

    public void getPurchaseAmount() {
    }
}
