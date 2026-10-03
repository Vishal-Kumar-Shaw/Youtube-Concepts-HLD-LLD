public class Soldier2 {
    private String weapon;
    private int health;
    private int speed;

    public Soldier2(String weapon, int health, int speed) {
        this.weapon = weapon;
        this.health = health;
        this.speed = speed;
    }

    public Soldier2 copy(){
        return new Soldier2(weapon, health, speed);
    }

}
