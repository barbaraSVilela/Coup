package modelo.cards;

import modelo.Hand;

public class AssassinoCard extends Card {
    
    public AssassinoCard() {
        this.setCardType(CardType.ASSASSINO);
    }

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        if(selectedDeck.getNumberOfCoins() >= 3){
            selectedDeck.removeCoin(3);
            secondDeck.removeRandomCard();
        }
    }

    @Override
    public String getImageName() {
        return "assassino";
    }

}