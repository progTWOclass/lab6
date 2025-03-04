package question1;

public class SnakeAlien extends Alien{

    //CONSTRUCTORS
    public SnakeAlien(int health, String name){
        super(health, name);
    }

    //methods
    @Override
    public int getDamage(){
        return 20;//the amount of damage
    }
}
