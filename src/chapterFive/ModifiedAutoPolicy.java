package chapterFive;

public class ModifiedAutoPolicy {
    private String state;
    private String stateCode;

    public void setState(String state) {
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setStateCode(String stateCode) {
        this.stateCode=stateCode;
//        if(stateCode != "NY") throw new IllegalArgumentException("PleaseInput The Right information") ;



        }

    public String getStateCode() {
        return stateCode;
    }

    public String correctCode() {
        return stateCode;
    }
//    }

//    public String getStateCode() {
//        return stateCode;
//    }
}
