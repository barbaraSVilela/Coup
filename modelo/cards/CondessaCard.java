package modelo.cards;

import modelo.Hand;

public class CondessaCard extends Card {
public CondessaCard() {
    this.setCardType(CardType.CONDESSA);
}

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        if(secondDeck.getNumberOfCoins() >= 3){
        secondDeck.removeCoin(3);
    }
    }

    @Override
    public String getImageName() {
        return "condessa";
    }
   
}