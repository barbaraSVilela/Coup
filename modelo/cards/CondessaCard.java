package modelo.cards;

import modelo.Hand;

public class CondessaCard extends Card {
public CondessaCard() {
    this.setCardType(CardType.CONDESSA);
}

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        secondDeck.removeCoin(3);
    }
   
}