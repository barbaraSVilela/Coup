package modelo;

import java.util.*;

public class Game extends Observable {
    private static Game game = new Game();
    private CardDeck deckP1, deckP2;
    private int player;
    private Coins bank;

    public Game() {
        bank.addCoins(100);
        deckP1 = new CardDeck();
        deckP2 = new CardDeck();
        player = 1;
    }

    private void nextPlayer() {
        player++;
        if (player == 4) {
            player = 1;
        }
    }

    public CardDeck getDeck1() {
        return deckP1;
    }

    public CardDeck getDeck2() {
        return deckP2;
    }

    public void play(CardDeck selectedDeck, String action) {
        if (player == 3) {
            return;
        }

        if (selectedDeck == deckP1) {
        }
    }

    private void playerAction(CardDeck selectedDeck, String action,CardDeck secondDeck) {
        switch (action) {
            case "renda":
                selectedDeck.addCoin(1);
                bank.removeCoins(1);
                nextPlayer();
                break;
            case "ajuda":
                selectedDeck.addCoin(2);
                bank.removeCoins(2);
                nextPlayer();
                break;
            case "golpe":
                selectedDeck.removeCoin(7);
                bank.addCoins(7);
                secondDeck.setCardSelected(secondDeck.getRandomCard());
                secondDeck.removeSelectedCard();
                break;
            case "assassino":
                selectedDeck
                
                break;
            case "capitao":

          case "duque":                
    }
}
    

    public void addCoinBank(int i) {

        bank.addCoins(i);
    }

    public void removeCoinBank(int i) {
        bank.removeCoins(i);
    }
}