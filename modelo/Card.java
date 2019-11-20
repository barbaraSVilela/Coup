package modelo;
import java.util.*;
// uma unica carta pode ser assassino,capitao,condessa,duque ou embaixador
public class Card extends Observable {
    private String cardName;
    private ICard card;
    private boolean faceUp;

public Card(String cardName ){
    this.faceUp = true;
    this.cardName = cardName;
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
    public int action(){
        return card.action(cardName);
    }
}
