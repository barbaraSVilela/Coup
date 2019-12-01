package modelo.cards;

import modelo.Hand;

public class DuqueCard extends Card {
    public DuqueCard() {
        this.setCardType(CardType.DUQUE);
    }

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        selectedDeck.addCoin(3);
    }

}