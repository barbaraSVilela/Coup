package modelo;
public class DuqueCard implements ICardType{
    public DuqueCard(){
        
    }
    public void action(CardDeck selectedDeck,CardDeck secondDeck) {
        selectedDeck.addCoin(3);
    }

    
}