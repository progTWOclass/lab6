package question1;

public class OgreAlien extends Alien{

    //constructor
    public OgreAlien(int health, String name){
        super(health, name);
    }

    //methods
    @Override
    public int getDamage() {
        return 30;//the amount of damage done by this alien
    }
}
