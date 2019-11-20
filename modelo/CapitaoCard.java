package modelo;

public class CapitaoCard implements ICardType{

    public CapitaoCard(){

    }

    public void action(CardDeck selectedDeck, CardDeck secondCard){
        selectedDeck.addCoin(2);
        secondCard.removeCoin(2);
    }
    
}   