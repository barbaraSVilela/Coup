package modelo.cards;

import java.util.Observable;

import modelo.Hand;

// uma unica carta, pode ser assassino,capitao,condessa,duque ou embaixador
public abstract class Card extends Observable {
    private boolean faceUp;
    private CardType cardType;

    public boolean isFacedUp(){
        return faceUp;
    }
    public void flip(){
        faceUp = !faceUp;
        setChanged();
        notifyObservers();
    }
    
    public abstract void action(Hand selectedDeck, Hand secondDeck);

    public abstract String getImageName();

    public String getImageId(){
        if(isFacedUp()){
            return getImageName();
        }
        else{
            return "imgBck";
        }
    }

    public String toString() {
        return cardType.toString();
    }

    public CardType getCardType(){
        return this.cardType;
    }

    public void setCardType(CardType cardType){
        this.cardType = cardType;
    }
    
    }
