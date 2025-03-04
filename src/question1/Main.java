package question1;

public class Main {
    public static void main(String[] args) {

        AlienPack pack = new AlienPack(3);
        pack.addAlien(new SnakeAlien(100, "SnakeOne"), 0);
        pack.addAlien(new OgreAlien(100, "OgreOne"), 1);
        pack.addAlien(new MarshmallowAlien(100, "MarshmallowOne"), 2);


        Alien[]alien = pack.getAliens();
        for(int i = 0; i<alien.length; i++){
            System.out.println("Alien " + (i + 1) + ": " + alien[i].getName() + "\n" +
                                "Health: " + alien[i].getHealth() + "\n" +
                                "Damage: " + alien[i].getDamage() + "\n");
        }
        System.out.println("Total damage first pack: " + pack.calculateDamage() + "\n");


        AlienPack pack2 = new AlienPack(5);
        pack2.addAlien(new SnakeAlien(100, "SnakeOne"), 0);
        pack2.addAlien(new OgreAlien(50, "OgreOne"), 1);
        pack2.addAlien(new MarshmallowAlien(70, "MarshmallowOne"), 2);
        pack2.addAlien(new MarshmallowAlien(40, "snakeTwo"), 4);
        pack2.addAlien(new OgreAlien(90, "OgreTwo"), 3);


        Alien[]alien2 = pack2.getAliens();
        for(int i = 0; i<alien.length; i++){
            System.out.println("Alien " + (i + 1) + ": " + alien[i].getName() + "\n" +
                    "Health: " + alien[i].getHealth() + "\n" +
                    "Damage: " + alien[i].getDamage() + "\n");
        }
        System.out.println("Total damage second pack: " + pack2.calculateDamage() + "\n");
    }
}
