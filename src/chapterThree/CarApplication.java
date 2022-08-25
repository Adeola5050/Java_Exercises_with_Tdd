package chapterThree;

public class CarApplication {

//   int carPrice;
    private int price;
    int discount;

    public void setCar(String car) {

    }

    public String getCar() {
        return "";
    }

    public void setPrice(int price) {
        this.price= price;
    }

    public int getPrice() {
        return price;
    }

    public int carPriceCanBeDisplay() {
        return price;

    }



    public int calculateDiscount() {
        return price * discount /(100);
    }

    public void setDiscount(int discount) {
        this.discount= discount;
    }

    public int getDiscount() {
        return discount;
    }

    public int calculateDiscountTwo() {
        return price * discount /(100);
    }

    public void setCarName(String carName) {
    }

    public void getCarName(String carName) {
    }

    public String displayCarName() {
        return "";
    }
}
