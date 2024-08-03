package animals;
public class Wolf extends Carnivorous implements Run, Swim, Voice {
    public Wolf(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " runs");
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
    private String sound = "roar!";
    public String voice() {
        return sound;
    }
    public boolean hasVoice() {
        return true;
    }
}
