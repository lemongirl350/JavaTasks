package animals;

public class Wolf extends Carnivorous implements Run, Swim, Voice {
    private String sound = "roar!";

    public Wolf(String name) {
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
    public String voice() {
        return sound;
    }
}
