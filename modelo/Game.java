package modelo;

import java.util.*;

public class Game extends Observable{
    private static Game game = new Game();
    private Hand handJ1,handJ2;
    private int currentPlayer;
    private boolean isGameOver;
    private int winner;
    
    public static Game getInstance(){
        return(game);
    }
    
    private Game(){
        handJ1 = new Hand();
        handJ2 = new Hand();
        currentPlayer = 1;
        handJ1.flipHand();
        setChanged();
        notifyObservers();
    }

    public void startOver(){
        Game.game = new Game();
        setChanged();
        notifyObservers();
    }

    public boolean getIsGameOver(){
        return isGameOver;
    }

    public int getWinner(){
        return winner;
    }
    
    public Hand getHandJ1(){
        return(handJ1);
    }
    
    public Hand getHandJ2(){
        return(handJ2);
    }

    private void doAction(Hand currentPlayer, Hand otherPlayer, ActionType action){
        switch(action){
            case ASSASSINO: currentPlayer.doCardAction(currentPlayer, otherPlayer, action); break;
            case CAPITAO: currentPlayer.doCardAction(currentPlayer, otherPlayer, action); break;
            case CONDESSA: currentPlayer.doCardAction(currentPlayer, otherPlayer, action); break;
            case DUQUE: currentPlayer.doCardAction(currentPlayer, otherPlayer, action); break;
            case EMBAIXADOR: currentPlayer.doCardAction(currentPlayer, otherPlayer, action); break;
            case AJUDA: currentPlayer.ajuda(); break;
            case GOLPE: currentPlayer.golpe(otherPlayer); break;
            case RENDA: currentPlayer.renda(); break;
            default:
             throw new IllegalArgumentException("Acao Invalida");
        }
    }

    private void flipHands(){
        handJ1.flipHand();
        handJ2.flipHand();
    }
    
    public void play(ActionType acao){
        if (currentPlayer == 1){
            doAction(handJ1, handJ2, acao);
            currentPlayer = 2;
            flipHands();
        }
        else if (currentPlayer == 2){
            doAction(handJ2, handJ1, acao);
            currentPlayer = 1;
            flipHands();
        }
        verifyIfGameIsOver();

        setChanged();
        notifyObservers();
    }

    private void verifyIfGameIsOver(){
        if(handJ1.isOutOfCards()){
            isGameOver = true;
            winner = 2;
        }
        else if(handJ2.isOutOfCards()){
            isGameOver = true;
            winner = 1;
        }
    }

    public int getCurrentPlayer(){
        return this.currentPlayer;
    }

}
