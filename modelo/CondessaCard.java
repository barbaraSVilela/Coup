package modelo;

public class CondessaCard implements ICardType {
    public CondessaCard() {
    }

    @Override
    public void action(CardDeck selectedDeck, CardDeck secondDeck){
            secondDeck.removeCoin(3);
    }
   
}