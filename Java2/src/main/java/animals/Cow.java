package animals;
public class Cow extends Herbivore implements Run, Swim, Voice {
    public Cow(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " runs");
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
    private String sound = "moo!";
    public String voice() {
        return sound;
    }
    public boolean hasVoice() {
        return true;
    }
}
