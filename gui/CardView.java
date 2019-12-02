package gui;

import javafx.scene.control.Button;
import modelo.ImageFactory;
import modelo.cards.Card;

import java.util.*;

public class CardView extends Button implements Observer {
    private Card card;

    public CardView(Card aCard) {
        super("", ImageFactory.getInstance().createImage(aCard.getImageId()));
        card = aCard;
        card.addObserver(this);
    }

    @Override
    public void update(Observable o, Object args) {
        this.setGraphic(ImageFactory.getInstance().createImage(card.getImageId()));
    }

}
