import animals.Animal;
import food.Food;
import animals.Voice;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(((Animal) animal).getName() + " says: " + animal.voice());
    }
}
