/*package modelo;

import java.util.*;

public class Game extends Observable {
    private static Game game = new Game();
    private CardDeck deckP1, deckP2;
    private int player;
    
    private Game(){
        deckP1 = new CardDeck();
        deckP2 = new CardDeck();
        player = 1;
    }
    public Game(CardDeck deckP1,CardDeck deckP2) {
        this.deckP1 = deckP1;
        this.deckP2 = deckP2;
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
            if(selectedDeck == deckP1){
                deckP1.play(deckP1, deckP2, action);
            }
            else if(selectedDeck == deckP2){
                deckP2.play(deckP2, deckP1, action);
            }

        }

}*/