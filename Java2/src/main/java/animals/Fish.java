package animals;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims");
    }
}
