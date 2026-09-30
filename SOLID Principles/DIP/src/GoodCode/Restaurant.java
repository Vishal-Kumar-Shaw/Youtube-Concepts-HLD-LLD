package GoodCode;

public class Restaurant {
    private Chef chef;
    public Restaurant(Chef chef) {
        this.chef = chef;
    }
    public void prepareFood(){
        // Now which chef is there, Restaurant don't know directly
        chef.cook();
    }
}
