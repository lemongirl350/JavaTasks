package animals;
public class Lama extends Herbivore implements Run, Swim, Voice {
    public Lama(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " runs");
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
    private String sound = "baa!";
    public String voice() {
        return sound;
    }
    public boolean hasVoice() {
        return true;
    }
}
