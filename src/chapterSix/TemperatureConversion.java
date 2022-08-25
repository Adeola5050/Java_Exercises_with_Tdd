package chapterSix;

public class TemperatureConversion {

   private int kelvin;
   private int celsius;
    public void setKelvin() {
    }

    public void setCelsius() {
    }

    public int getKelvin() {
        return kelvin;
    }

    public int getCelsius() {
        return celsius;
    }
    public void setCelsius(int celsius) {
        this.celsius=celsius;
    }

    public int calculateKelvin() {
        return (int) (celsius + 273.15);
    }


    public void setKelvin(int kelvin) {
        this.kelvin=kelvin;
    }

    public int calculateCelsius() {
        return (int) (kelvin - 273);
    }
}
