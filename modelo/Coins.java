package modelo;
public class Coins{

    public int coins;

    public Coins(){
        coins = 0;
    }   
    public void addCoins(int i){
        coins += i;
    }
    public void removeCoins(int i){
        coins-= i;
    }
    public int getCoins(){
        return coins;
    }
}