package chapterEight;

public class EmergencyResponse {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String location;
    private String time;

    public void setReport(String report) {

    }

    public void setCallerInformation() {
    }

    public String getCallerInformation() {
        return firstName +
                lastName +
                phoneNumber
                + location
                + time;
    }

    public String getReport(String s) {
        return getCallerInformation();
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public void setTime(String time) {
        this.time= time;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String reportedEmergency() {
        return getCallerInformation();
    }

    public String getReport() {
        return getReport("robbery") + getCallerInformation() ;
    }
}
