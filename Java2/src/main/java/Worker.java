import animals.Animal;
import food.Food;
import animals.Voice;
public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }
    public void getVoice(Animal animal) {
        if (animal.hasVoice()) {
            System.out.println(animal.getName() + " says: " + ((Voice)animal).voice());
        }  else {
            throw new IllegalArgumentException("The animal is dumb");
        }

    }
}
