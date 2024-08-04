package food;

public class Herb extends Grass {
    public Herb(String name) {
        super(name);
    }

    @Override
    public int nutrition() {
        return 5;
    }
}
