package animals;
public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(getName() + " flies");
    }
    private String sound = "screech!";
    public String voice() {
        return sound;
    }
    public boolean hasVoice() {
        return true;
    }
}
