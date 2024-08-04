package food;

public class Shrimp extends Meat {
    public Shrimp(String name) {
        super(name);
    }

    @Override
    public int nutrition() {
        return 2;
    }
}
