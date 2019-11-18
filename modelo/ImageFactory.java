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
        case "img1":
            return ("file:./imagens/Assassino.png");
        case "img2":
            return ("file:./imagens/Assassino.png");
        case "img3":
            return ("file:./imagens/Assassino.png");
        case "img4":
            return ("file:./imagens/Assassino.png");
        case "img5":
            return ("file:./imagens/Assassino.png");
        case "img6":
            return ("file:./imagens/Embaixador.png");
        case "img7":
            return ("file:./imagens/Embaixador.png");
        case "img8":
            return ("file:./imagens/Embaixador.png");
        case "img9":
            return ("file:./imagens/Embaixador.png");
        case "img10":
            return ("file:./imagens/Embaixador.png");
        case "img11":
            return ("file:./imagens/Capitao.jpg");
        case "img12":
            return ("file:./imagens/Capitao.jpg");
        case "img13":
            return ("file:./imagens/Capitao.jpg");
        case "img14":
            return ("file:./imagens/Capitao.jpg");
        case "img15":
            return ("file:./imagens/Capitao.jpg");
        case "img16":
            return ("file:./imagens/Condessa.jpg");
        case "img17":
            return ("file:./imagens/Condessa.jpg");
        case "img18":
            return ("file:./imagens/Condessa.jpg");
        case "img19":
            return ("file:./imagens/Condessa.jpg");
        case "img20":
            return ("file:./imagens/Condessa.jpg");
        case "img21":
            return ("file:./imagens/Duque.jpg");
        case "img22":
            return ("file:./imagens/Duque.jpg");
        case "img23":
            return ("file:./imagens/Duque.jpg");
        case "img24":
            return ("file:./imagens/Duque.jpg");
        case "img25":
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
            img = new Image(id2File(imgId));
            images.put(imgId, img);
        }

        // Image img = new Image(id2File(imgId));
        return (new ImageView(img));
    }
}