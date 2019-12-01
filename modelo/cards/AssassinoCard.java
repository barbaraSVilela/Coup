package modelo.cards;

import modelo.Hand;

public class AssassinoCard extends Card {
    
    public AssassinoCard() {
        this.setCardType(CardType.ASSASSINO);
    }

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        selectedDeck.removeCoin(3);
        secondDeck.removeRandomCard();
    }

}