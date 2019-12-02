package modelo;
import java.util.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageFactory {
    private static ImageFactory imgf = new ImageFactory();
    private Map<String, Image> images;

    public static ImageFactory getInstance() {
        return (imgf);
    }

    private ImageFactory() {
        images = new HashMap<>();
    }

    private String id2File(String imgId) {
        switch (imgId) {
        case "assassino":
            return ("file:./imagens/Assassino.png");
        case "embaixador":
            return ("file:./imagens/Embaixador.png");
        case "capitao":
            return ("file:./imagens/Capitao.png");
        case "condessa":
            return ("file:./imagens/Condessa.png");
        case "duque":
            return ("file:./imagens/Duque.jpg");
        case "imgBck":
            return ("file:./imagens/Back.png");
        default:
            throw new IllegalArgumentException("Imagem id Invalida");
        }
    }

    public ImageView createImage(String imgId) {
        Image img = images.get(imgId);
        if (img == null) {
            img = new Image(id2File(imgId),305, 305, true, true);
            images.put(imgId, img);
        }

        // Image img = new Image(id2File(imgId));
        return (new ImageView(img));
    }
}