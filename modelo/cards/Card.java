package modelo.cards;

import modelo.Hand;

// uma unica carta, pode ser assassino,capitao,condessa,duque ou embaixador
public abstract class Card {
    private boolean faceUp;
    private CardType cardType;

    // public Card(String cardName){
    //     ImageFactory.getInstance().createImage("imgBck");
    //     this.faceUp = true;
    //     this.cardName = cardName;
    //     switch(cardName){
    //         case "assassino":
    //             card = new AssassinoCard();
    //             this.id = "img1";
    //             break;
    //         case "capitao":
    //             this.id = "img3";
    //             card = new CapitaoCard();
    //             break;
    //         case "condessa":
    //             this.id = "img4";
    //             card = new CondessaCard();
    //             break;
    //         case "duque":
    //             this.id = "img5";
    //             card = new DuqueCard();
    //             break;
    //         case "embaixador":
    //             this.id = "img2";
    //             card = new EmbaixadorCard();
    //             break;
    //         default:
    //             throw new IllegalArgumentException("Carta nao existente");
    //         }


    //     }
    public boolean isFacedUp(){
        return faceUp;
    }
    public void flip(){
        faceUp = !faceUp;
        // if (faceUp == true){
        //     faceUp = false;
        //     this.setGraphic(ImageFactory.getInstance().createImage("imgBck"));
        // }else
        // {
        //     this.setGraphic(ImageFactory.getInstance().createImage(id));
        //     faceUp = true;
        // }
    }
    public abstract void action(Hand selectedDeck, Hand secondDeck);

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
