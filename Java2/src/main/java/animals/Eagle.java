package animals;

public class Eagle extends Carnivorous implements Fly, Voice {
    private String sound = "screech!";

    public Eagle(String name) {
        super(name);
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
