package modelo;

import java.util.*;

import gui.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CoupMain extends Application implements Observer{
   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Game.getInstance().addObserver(this);
        
        primaryStage.setTitle("COUP");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
       
        HandView deckJ1 = new HandView(1);
        ScrollPane sd1 = new ScrollPane();
        sd1.setPrefSize(415, 320);
        sd1.setContent(deckJ1);
        grid.add(sd1,0,0);
        
        MoedaView moedas = new MoedaView();
        grid.add(moedas,0,1);

        CurrentPlayerView player = new CurrentPlayerView();
        grid.add(player, 1, 0);

        AcoesView acoes = new AcoesView();
        grid.add(acoes, 1, 1);

        HandView deckJ2 = new HandView(2);
        ScrollPane sd2 = new ScrollPane();
        sd2.setPrefSize(415, 320);
        sd2.setContent(deckJ2);
        grid.add(sd2,0,2);
                
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);        
        primaryStage.show();
    }

    @Override
    public void update(Observable o,Object arg){
       if(Game.getInstance().getIsGameOver()){
        Alert winnerAlert = new Alert(Alert.AlertType.WARNING);
        winnerAlert.setTitle("Fim de jogo");
        winnerAlert.setHeaderText("O jogo acabou!");
        winnerAlert.setContentText("O vencedor foi o jogador " + Game.getInstance().getWinner());
        winnerAlert.showAndWait();
        Game.getInstance().startOver();
       }
    }
    
}
