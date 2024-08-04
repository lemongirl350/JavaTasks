package animals;

public class Cow extends Herbivore implements Run, Swim, Voice {
    private String sound = "moo!";

    public Cow(String name) {
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
