package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import modelo.ActionType;
import modelo.Game;

public class AcoesView extends GridPane {

    public AcoesView() {
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));

        Button btnAjuda = new Button("AJUDA");
        this.add(btnAjuda, 0, 0);
        Button btnRenda = new Button("RENDA");
        this.add(btnRenda, 0, 1);
        Button btnGolpe = new Button("GOLPE");
        this.add(btnGolpe, 0, 2);
        Button btnAssassino = new Button("ASSASSINO");
        this.add(btnAssassino, 0, 3);
        Button btnDuque = new Button("DUQUE");
        this.add(btnDuque, 1, 0);
        Button btnEmbaixador = new Button("EMBAIXADOR");
        this.add(btnEmbaixador, 1, 1);
        Button btnCapitao = new Button("CAPITAO");
        this.add(btnCapitao, 1, 2);
        Button btnCondessa = new Button("CONDESSA");
        this.add(btnCondessa, 1, 3);

        btnAjuda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.AJUDA);
            }
        });

        btnRenda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.RENDA);
            }
        });
        btnGolpe.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.GOLPE);
            }
        });

        btnAssassino.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.ASSASSINO);
            }
        });
        btnDuque.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.DUQUE);
            }
        });

        btnEmbaixador.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.EMBAIXADOR);
            }
        });

        btnCapitao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.CAPITAO);
            }
        });

        btnCondessa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Game.getInstance().play(ActionType.CONDESSA);
            }
        });
    }

}
