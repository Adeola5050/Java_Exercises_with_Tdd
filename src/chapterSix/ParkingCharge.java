package chapterSix;

public class ParkingCharge {
    private double parkingChargeFee;
    private double additionalFee;

    //    private double minimumFee;
    public void setParkingChargeFee() {

    }

    public double getParkingChargeFee() {
        return parkingChargeFee;
    }

    public void setParkingChargeFee(double parkingChargeFee) {
        this.parkingChargeFee= parkingChargeFee;
    }

    public double calculateMinimumFee() {
        return parkingChargeFee;
    }
    public void setAdditionalFee(double additionalFee) {
        this.additionalFee=additionalFee;
    }

    public double getAdditionalFee() {
        return additionalFee;

    }
    public double calculateAdditionalCharge() {
        return parkingChargeFee + additionalFee;
    }
}
