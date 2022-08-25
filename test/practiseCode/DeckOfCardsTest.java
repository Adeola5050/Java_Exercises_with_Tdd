package practiseCode;


class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards= new DeckOfCards();
        for (int i = 1; i <=52 ; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i% 4==0){
                System.out.println();
            }

        }
    }


}