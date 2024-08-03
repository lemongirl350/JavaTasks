package animals;
public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    public Duck(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " runs");
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
    public void fly() {
        System.out.println(getName() + " flies");
    }
    private String sound = "quack-quack!";
    public String voice() {
        return sound;
    }
    public boolean hasVoice() {
        return true;
    }
}
