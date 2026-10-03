public class Soldier1 implements Cloneable {
    private String weapon;
    private int health;
    private int speed;

    public Soldier1(String weapon, int health, int speed) {
        this.weapon = weapon;
        this.health = health;
        this.speed = speed;
    }

    @Override
    public Soldier1 clone(){
        try {
            return (Soldier1) super.clone();
        } catch(CloneNotSupportedException ex){
            throw new AssertionError(ex);
        }
    }
}
