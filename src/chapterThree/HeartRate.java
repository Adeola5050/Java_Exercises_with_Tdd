package chapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRate(String firstName, String lastName, String dateOfBirth) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth= dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
