package modelo;

import java.util.Random;

import modelo.cards.*;

public class CardGenerator {
        public static Card generateRandomCard(){
            Random cardGenerator = new Random();
            int n = cardGenerator.nextInt(5);
            
            switch(n){
                case 0: return new AssassinoCard();
                case 1: return new CapitaoCard();
                case 2: return new CondessaCard();
                case 3: return new DuqueCard();
                case 4: return new EmbaixadorCard();
                default: throw new IllegalArgumentException("Carta inválida");
            }
        }

        public static Card generateSpecificCard(CardType cardType){
            switch(cardType){
                case ASSASSINO: return new AssassinoCard();
                case CAPITAO: return new CapitaoCard();
                case CONDESSA: return new CondessaCard();
                case DUQUE: return new DuqueCard();
                case EMBAIXADOR: return new EmbaixadorCard();
                default: throw new IllegalArgumentException("Carta inválida");
            }
        }
}