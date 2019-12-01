package modelo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;


public class CoupMain extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

  /*  //private CardDeck player1, player2;
    private boolean playable;
    private Text message = new Text();
    private HBox player1Cards = new HBox(20);
    private HBox player2Cards = new HBox(20);
    */
    private Parent content(){
        
        Pane root = new Pane();
        root.setPrefSize(1000,1000);
        Region background = new Region();
        background.setPrefSize(1000, 1000);
        HBox rootLayout = new HBox(5);
        rootLayout.setPadding(new Insets(5, 5, 5, 5));
        Rectangle left = new Rectangle(700, 950);
        left.setArcWidth(50);
        left.setArcHeight(50);
        left.setFill(Color.BLACK);
        Rectangle right = new Rectangle(300, 950);
        right.setArcWidth(50);
        right.setArcHeight(50);
        right.setFill(Color.AQUAMARINE);
       //esquerda
        VBox leftVBox1 = new VBox(50);
        leftVBox1.setAlignment(Pos.TOP_CENTER);
        //TODO: MUDAR PARA NUMERO DE MOEDAS REAL
        Text moedas1 = new Text("Jogador 1 Moedas: 0");
        moedas1.setFill(Color.WHITE);  
        leftVBox1.getChildren().addAll(moedas1);
        
        VBox leftVBox2 = new VBox(50);
        leftVBox2.setAlignment(Pos.BOTTOM_CENTER);
        Text moedas2 = new Text("Jogador 2 Moedas: 1" );
        moedas2.setFill(Color.WHITE);
        leftVBox2.getChildren().add(moedas2);
        
        //direita
        VBox rightVBox = new VBox(20);
        rightVBox.setAlignment(Pos.CENTER);

        Text actions = new Text("Ações Gerais: ");
        Button btnAjuda = new Button("AJUDA");
        Button btnRenda = new Button("RENDA");
        Button btnGolpe = new Button("GOLPE");
        Button btnContestar = new Button("CONTESTAR");
        HBox buttonsHBox1 = new HBox(15, btnAjuda, btnRenda);
        HBox buttonsHBox2 = new HBox(15,btnGolpe, btnContestar);
        buttonsHBox1.setAlignment(Pos.CENTER);
        buttonsHBox2.setAlignment(Pos.CENTER);

        Text actionCard = new Text("Ações da Carta: ");
        Button btnAssassino = new Button("ASSASSINO");
        Button btnDuque = new Button("DUQUE");
        Button btnEmbaixador = new Button("EMBAIXADOR");
        Button btnCapitao = new Button("CAPITAO");
        Button btnCondessa = new Button("CONDESSA");
        HBox buttonsHBox3 = new HBox(15, btnAssassino, btnDuque);
        HBox buttonsHBox4 = new HBox(15,btnCapitao, btnCondessa);
        HBox buttonsHBox5 = new HBox(15,btnEmbaixador);
        buttonsHBox3.setAlignment(Pos.CENTER);
        buttonsHBox4.setAlignment(Pos.CENTER);
        buttonsHBox5.setAlignment(Pos.CENTER);
        rightVBox.getChildren().addAll(actions, buttonsHBox1,buttonsHBox2,actionCard,buttonsHBox3,buttonsHBox4,buttonsHBox5);
        
        rootLayout.getChildren().addAll(new StackPane(left, leftVBox1,leftVBox2), new StackPane(right, rightVBox));
        root.getChildren().addAll(background, rootLayout);

        ImageView image1 = ImageFactory.getInstance().createImage("img1");
        image1.fitWidthProperty().bind(stage.widthProperty()); 
        ImageView image2 = ImageFactory.getInstance().createImage("img2");
        image2.setX(50);
        ImageView image3 = ImageFactory.getInstance().createImage("img3");
        image3.setX(0);
        image3.setY(50);
        ImageView image4 = ImageFactory.getInstance().createImage("img4");
        image4.setX(50);
        image4.setY(50);
        leftVBox1.getChildren().add(image1);
        leftVBox1.getChildren().add(image2);
        leftVBox1.getChildren().add(image3);
        leftVBox1.getChildren().add(image4);


        // botoes evento
        /*btnAjuda.setOnAction(event -> {
        });*/
        return root;
    }

    private void startNewGame(){
        

    }
    private void endGame(){

    }
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setScene(new Scene(content()));
        primaryStage.setHeight(1000);
        primaryStage.setWidth(1000);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Coup");
        primaryStage.show();
    }

 }