package food;

public class Mouse extends Meat {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public int nutrition() {
        return 4;
    }
}
