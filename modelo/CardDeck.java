package modelo;

import java.util.*;

// mão de um jogador
public class CardDeck extends Observable {
    private static final int TOTALCARDS = 2;
    private Card selected;
    private ArrayList<Card> cards;
    private Coins playerCoins;

    public CardDeck() {
        playerCoins.addCoins(1);
        this.selected = null;
        cards = new ArrayList<Card>(TOTALCARDS);
        Random cardGenerator = new Random();
        for (int i = 0; i < TOTALCARDS; i++) {
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
            cards.add(card);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int numberOfCards() {
        return cards.size();
    }

    public void removeSelectedCard() {
        if (selected != null) {
            cards.remove(selected);
            setChanged();
            notifyObservers();
        }
    }

    public void setCardSelected(Card card) {
        this.selected = card;
    }

    public Card getCardSelected() {
        return selected;
    }

    public void addCoin(int i) {
        playerCoins.addCoins(i);
    }

    public void removeCoin(int i) {
        playerCoins.removeCoins(i);
    }

    public int getNumberOfCoins() {
        return playerCoins.getCoins();
    }

}