package question1;

public class MarshmallowAlien extends Alien{

    //constructors
    public MarshmallowAlien(int health, String name){
        super(health, name);
    }

    //methods
    @Override
    public int getDamage() {
        return 10;//the amount of damage done by this alien
    }
}
