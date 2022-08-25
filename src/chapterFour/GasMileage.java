package chapterFour;

public class GasMileage {

    private int mile;
    private int gallon;
    private double noOfTrip;

    public GasMileage(int mile, int gallon, int noOfTrip) {
        this.mile=mile;
        this.gallon=gallon;
        this.noOfTrip=noOfTrip;
    }

    public void setMile(int mile) {
        this.mile=mile;
    }

    public void setGallon(int gallon) {
        this.gallon=gallon;
    }

    public int getMile() {
        return mile;
    }

    public int getGallon() {
        return gallon;
    }

    public int calculateTrip() {
        return mile / gallon;
    }

    public double setNoOfTrip(double noOfTrip) {
//        this.noOfTrip= noOfTrip;
        return noOfTrip;
    }
    public double getNoOfTrip(){
        return 0;
    }

    public  int calculateAverage() {
        return (int) (gallon / mile /(double)(noOfTrip));
    }
}

