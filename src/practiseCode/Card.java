package practiseCode;

public class Card {

    private String face;
//    private final face;
    private String suit;

    public Card(String cardFace, String cardSuit){
        this.face=cardFace;
        this.suit= cardSuit;
    }

    public String toString(){
        return  face + "of" +suit;
    }
}
