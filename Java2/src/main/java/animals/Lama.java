package animals;

public class Lama extends Herbivore implements Run, Swim, Voice {
    private String sound = "baa!";

    public Lama(String name) {
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
