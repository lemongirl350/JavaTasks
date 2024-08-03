package animals;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }
    public void eat(Food food) {
        if (food instanceof Meat) {
            satiety += food.nutrition();
            System.out.println(getName() + " eats " + food.getName() + ". And its satiety is " + satiety);
        } else {
            System.out.println(getName() + " can't eat " + food.getName() + ". Try something else!");
        }
    }
}
