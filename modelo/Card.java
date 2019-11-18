package modelo;
import java.util.*;
public class Card extends Observable {

    private ICard card;
    private boolean faceUp;

public Card(String cardName ){
    faceUp = true;
    switch(cardName){
    case "assassino":
        card = new AssassinoCard();
        break;
    case "capitao":
        card = new CapitaoCard();
        break;
    case "condessa":
        card = new CondessaCard();
        break;
    case "duque":
        card = new DuqueCard();
        break;
    case "embaixador":
        card = new EmbaixadorCard();
        break;
    default:
     throw new IllegalArgumentException("Carta nao existente");

}
}
    public boolean isFacedUp(){
        return faceUp;
    }
    public void flip(){
        if (faceUp == true){
            faceUp = false;
        }else
        {
            faceUp = true;
        }
        setChanged();
        notifyObservers();
    }
}
