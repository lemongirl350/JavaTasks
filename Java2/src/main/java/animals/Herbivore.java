package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            satiety += food.nutrition();
            System.out.println(getName() + " eats " + food.getName() + ". And its satiety is " + satiety);
        } else {
            System.out.println(getName() + " can't eat " + food.getName() + ". Try something else!");
        }
    }
}
