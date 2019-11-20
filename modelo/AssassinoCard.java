package modelo;

public class AssassinoCard implements ICardType {
    public AssassinoCard() {

    }

    public void action(CardDeck selectedDeck, CardDeck secondDeck){
        selectedDeck.removeCoin(3);
        secondDeck.setCardSelected(secondDeck.getRandomCard());
        secondDeck.removeSelectedCard();
    }

}