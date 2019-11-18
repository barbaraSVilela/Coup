package modelo;
public class DuqueCard implements ICard{
    public DuqueCard(){
        
    }
    public int action(String type) {
        if (type == "moedas"){
            return 2;
        }
        else
         return 0;

    }



    
}