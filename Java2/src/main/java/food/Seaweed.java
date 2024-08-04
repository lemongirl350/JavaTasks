package food;

public class Seaweed extends Grass {
    public Seaweed(String name) {
        super(name);
    }

    @Override
    public int nutrition() {
        return 10;
    }
}
