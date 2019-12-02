package gui;

import java.util.*;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import modelo.Game;
import modelo.Hand;
import modelo.cards.Card;

public class HandView extends HBox implements Observer {
    private int jogador;
    private Hand hand;

    public HandView(int nroJog) {
        super(4);
        this.setAlignment(Pos.CENTER);

        jogador = nroJog;

        hand = null;
        if (jogador == 1) {
            hand = Game.getInstance().getHandJ1();
        } else {
            hand = Game.getInstance().getHandJ2();
        }
        hand.addObserver(this);
        changeCards();

    }

    @Override
    public void update(Observable o, Object arg) {
        if (jogador == 1) {
            hand = Game.getInstance().getHandJ1();
        } else {
            hand = Game.getInstance().getHandJ2();
        }
        changeCards();
    }

    private void changeCards() {
        this.getChildren().clear();
        for (Card card : hand.getCards()) {
            if (card != null) {
                CardView cv = new CardView(card);
                this.getChildren().add(cv);
            }
        }
    }
}
