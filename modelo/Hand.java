package modelo;

import java.util.*;

import modelo.cards.AssassinoCard;
import modelo.cards.Card;
import modelo.cards.CardType;

// mão de um jogador
public class Hand {
    private Card[] cards;
    private Coins playerCoins;

    public Hand() {
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
        int n = random.nextInt(2);
        cards[n] = null;
    }

    // acoes do jogo inicio
    private void actionCard(Hand selected, Hand second, CardType cardType){
      Card selectedCard = selected.GetCardByType(cardType);
        if (selectedCard != null){
           selectedCard.action(selected, second);
       }
       else{
           Card fakeCard = CardGenerator.generateSpecificCard(cardType);
           fakeCard.action(selected, second);
       }
    }

    private void renda() {
        this.addCoin(1);
    }

    private void ajuda() {
        this.addCoin(2);
    }

    private void golpe(Hand second) {
        this.removeCoin(7);
        second.removeRandomCard();
    }

    private void contestar(Hand second, CardType cardType) {
        boolean removed = second.removeCardByType(cardType);
        second.getNewCard();
        if (!removed)
            second.removeRandomCard();
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
    public void play(Hand selectedDeck, Hand secondDeck, String action) {

        // switch (action) {
        // case "renda":
        //     renda();
        //     break;
        // case "ajuda":
        //     ajuda();
        //     break;
        // case "golpe":
        //     golpe(secondDeck);
        //     break;
        // case "contestar":
        //     contestar(secondDeck, action);
        //     break;
        // case "assassino":
        //     actionCard(selectedDeck, secondDeck, action);
        //     break;
        // case "duque":
        //     actionCard(selectedDeck, secondDeck, action);
        //     break;
        // case "embaixador":
        //     actionCard(selectedDeck, secondDeck, action);
        //     break;
        // case "capitao":
        //     actionCard(selectedDeck, secondDeck, action);
        //     break;
        // case "condessa":
        //     actionCard(selectedDeck, secondDeck, action);
        //     break;
        // default:
        //     throw new IllegalArgumentException("Acao Invalida");

        // }

    }

    public void getNewCard() {
        Card newCard = CardGenerator.generateRandomCard();
        for (int i = 0; i < 2; i++) {
            if (cards[i] == null) {
                cards[i] = newCard;
            }
        }
    }

    public Card GetCardByType(CardType cardType) {
        for (int i = 0; i < 2; i++) {
            if (cards[i].getCardType() == cardType) {
                return cards[i];
            }
        }
        return null;
    }
}
