package animals;
import food.Food;
public abstract class Animal {
    private String name;
    protected int satiety;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat(Food food);
    public String getName() {
        return name;
    }
    public abstract boolean hasVoice();
}
