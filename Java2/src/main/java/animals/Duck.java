package animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    private String sound = "quack-quack!";

    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " runs");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies");
    }

    @Override
    public String voice() {
        return sound;
    }

}
