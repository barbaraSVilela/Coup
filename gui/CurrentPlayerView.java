package gui;

import java.util.*;
import javafx.scene.control.Label;
import modelo.Game;

public class CurrentPlayerView extends Label implements Observer {

    public CurrentPlayerView() {
        Game.getInstance().addObserver(this);
        this.setText("JOGADOR ATUAL: " + Game.getInstance().getCurrentPlayer());
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setText("JOGADOR ATUAL: " + Game.getInstance().getCurrentPlayer());
    }
}
