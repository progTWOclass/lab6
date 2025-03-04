package question1;

public class AlienPack {

    //class variable
    private final Alien[] aliens;

    //CONSTRUCTOR
    public AlienPack (int numAliens)
    {
        this.aliens = new Alien[numAliens];
    }

    //getter
    public Alien[] getAliens()
    {
        return aliens;
    }

    //methods
    //method for adding an alien to the game
    public void addAlien(Alien newAlien, int index)
    {
        aliens[index] = newAlien;
    }

    //method for calculating the damage done by an alien
    public int calculateDamage()
    {
        int damage = 0;
        for (Alien alien : aliens)
        {
            if(alien != null)
                damage += alien.getDamage();
        }
        return damage;
    }
}
