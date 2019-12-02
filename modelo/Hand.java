package modelo;

import java.util.*;

import modelo.cards.Card;
import modelo.cards.CardType;

// mão de um jogador
public class Hand extends Observable {
    private Card[] cards;
    private Coins playerCoins;

    public Hand() {
        playerCoins = new Coins();
        playerCoins.addCoins(1);
        this.getNewHand();
    }

    public Card[] getCards() {
        return cards;
    }

    public boolean isOutOfCards() {
        return cards[0] == null && cards[1] == null;
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

    public void getNewHand() {
        cards = new Card[2];

        cards[0] = CardGenerator.generateRandomCard();
        cards[1] = CardGenerator.generateRandomCard();
    }

    public void removeRandomCard() {
        Random random = new Random();
        int n = random.nextInt(1);

        if(cards[n] == null){
            cards[0] = null;
            cards[1] = null;
            return;
        }
        
        cards[n] = null;
        setChanged();
        notifyObservers();
    }

    // acoes do jogo inicio
    public void renda() {
        this.addCoin(1);
    }

    public void ajuda() {
        this.addCoin(2);
    }

    public void golpe(Hand second) {
        if (second.getNumberOfCoins() >= 7) {
            second.removeCoin(7);
            second.removeRandomCard();
            setChanged();
            notifyObservers();
        }
    }

    public boolean removeCardByType(CardType cardType) {
        for (int i = 0; i < 2; i++) {
            if (cards[i].getCardType() == cardType) {
                cards[i] = null;
                return true;
            }
        }
        return false;
    }
    // fim acoes do jogo

    // metodo para a jogada
    public void doCardAction(Hand selectedDeck, Hand secondDeck, ActionType action) {
        Card actionCard;
        CardType cardType;
        switch (action) {
        case ASSASSINO:
            actionCard = getCardByType(CardType.ASSASSINO);
            cardType = CardType.ASSASSINO;
            break;
        case CAPITAO:
            actionCard = getCardByType(CardType.CAPITAO);
            cardType = CardType.CAPITAO;
            break;
        case CONDESSA:
            actionCard = getCardByType(CardType.CONDESSA);
            cardType = CardType.CONDESSA;
            break;
        case DUQUE:
            actionCard = getCardByType(CardType.DUQUE);
            cardType = CardType.DUQUE;
            break;
        case EMBAIXADOR:
            actionCard = getCardByType(CardType.EMBAIXADOR);
            cardType = CardType.EMBAIXADOR;
            break;
        default:
            throw new IllegalArgumentException("Acao Invalida");
        }
        if (actionCard != null) {
            actionCard.action(selectedDeck, secondDeck);
        } else {
            Card fakeCard = CardGenerator.generateSpecificCard(cardType);
            fakeCard.action(selectedDeck, secondDeck);
        }

        setChanged();
        notifyObservers();
    }

    public void getNewCard() {
        Card newCard = CardGenerator.generateRandomCard();
        for (int i = 0; i < 2; i++) {
            if (cards[i] == null) {
                cards[i] = newCard;
                setChanged();
                notifyObservers();
                return;
            }
        }
    }

    public Card getCardByType(CardType cardType) {
        for (int i = 0; i < 2; i++) {
            if (cards[i] != null && cards[i].getCardType() == cardType) {
                setChanged();
                notifyObservers();
                return cards[i];
            }
        }
        return null;
    }

    public void flipHand() {
        if(cards[0] != null)
        cards[0].flip();
        if(cards[1] != null)
        cards[1].flip();
    }
}
