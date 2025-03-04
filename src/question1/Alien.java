package question1;

public abstract class Alien {

    //class variables
    private int health; // 0=dead, 100=full strength
    private String name;

    //constructor
    public Alien (int health, String name) {
        this.health = health;
        this.name = name;
    }

    //getters and setters
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //methods
    public abstract int getDamage();
}
