package chapterSix;

public class LeapYear {

    private int year;
    public void setYear() {
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public int getYear(int year) {
        return year;
    }

    public int calculateLeapYear() {
        if (year % 4 == 0) {
            if(year % 100 !=0){
                if(year% 400 ==0){
                    return year;
                }
            }
        }
        return year;
    }
}
