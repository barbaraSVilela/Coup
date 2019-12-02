package gui;

import java.util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import modelo.Game;

public class MoedaView extends GridPane implements Observer{
    private TextField coinsJ1,coinsJ2;
    
    public MoedaView(){
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        
        Game.getInstance().addObserver(this);
        
        coinsJ1 = new TextField();
        coinsJ2 = new TextField();
      
        coinsJ1.setText(""+Game.getInstance().getHandJ1().getNumberOfCoins());
        coinsJ2.setText(""+Game.getInstance().getHandJ2().getNumberOfCoins());

        this.add(new Label("Moedas:"),0,0);
        this.add(new Label("Jogador 1:"),0,1);
        this.add(coinsJ1,1,1);
        this.add(new Label("Jogador 2:"),0,2);
        this.add(coinsJ2,1,2);
    }
    
    @Override
    public void update(Observable o,Object arg){
        coinsJ1.setText(""+Game.getInstance().getHandJ1().getNumberOfCoins());
        coinsJ2.setText(""+Game.getInstance().getHandJ2().getNumberOfCoins());
    }    
}

