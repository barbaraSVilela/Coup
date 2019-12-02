package modelo.cards;

import modelo.Hand;

public class CapitaoCard extends Card {

    public CapitaoCard() {
        this.setCardType(CardType.CAPITAO);
    }

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        selectedDeck.addCoin(2);
        secondDeck.removeCoin(2);
    }

    @Override
    public String getImageName() {
        return "capitao";
    }
    
}   