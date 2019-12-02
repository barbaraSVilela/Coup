package modelo.cards;

import modelo.Hand;

public class EmbaixadorCard extends Card {

    public EmbaixadorCard() {
        this.setCardType(CardType.EMBAIXADOR);
    }

    @Override
    public void action(Hand selectedDeck, Hand secondDeck) {
        selectedDeck.getNewHand();
    }

    @Override
    public String getImageName() {
        return "embaixador";
    }

}