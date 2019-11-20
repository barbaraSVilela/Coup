package modelo;

import java.util.*;

public class Game extends Observable {
    private static Game game = new Game();
    private CardDeck deckP1, deckP2;
    private int player;

    public Game() {
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
}