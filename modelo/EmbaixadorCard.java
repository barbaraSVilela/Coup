package modelo;

import java.util.*;

public class EmbaixadorCard implements ICardType {
    public EmbaixadorCard() {
    }

    public void action(CardDeck selectedDeck, CardDeck secondDeck){
        selectedDeck.setCardSelected(selectedDeck.getCardByIndex(0));
        selectedDeck.removeSelectedCard();
        selectedDeck.setCardSelected(selectedDeck.getCardByIndex(1));
        selectedDeck.removeSelectedCard();
        Random cardGenerator = new Random();
        for (int i = 0; i < 2; i++) {
            int n = cardGenerator.nextInt(5);
            String cardName;
            switch (n) {
            case 0:
                cardName = "assassino";
                break;
            case 1:
                cardName = "condessa";
                break;
            case 2:
                cardName = "duque";
            case 3:
                cardName = "embaixador";
            case 4:
                cardName = "capitao";
            default:
                throw new IllegalArgumentException("Carta nao existente");
            }
        Card card = new Card(cardName);           
        card.flip();
        }
    }

}