package practiseCode;

public class RollDie {


    private int frequency;
    private  int roll;
    private int face;

    public void setFrequency(int frequency) {
        this.frequency=frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setRoll(int roll) {
        this.roll=roll;
    }

    public void setFace(int face) {
        this.face=face;
    }

    public int getRoll() {
        return roll;
    }



    public int calculateFrequency() {
        return frequency  + (roll);
    }

    public int displayRollTime() {
        return roll;
    }
}
