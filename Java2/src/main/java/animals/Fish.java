package animals;
public class Fish extends Carnivorous implements Swim {
    public Fish(String name) {
        super(name);
    }
    public void swim() {
        System.out.println(getName() + " swims");
    }
    public boolean hasVoice() {
        return false;
    }
}
