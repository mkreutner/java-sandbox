package sandbox.workspace.dyma.Chap05;

import sandbox.workspace.dyma.Chap05.Color;
import sandbox.workspace.dyma.Chap05.Origin;
import sandbox.workspace.dyma.Chap05.Fruit;

public class Banana extends Fruit {

    public Banana(String origin) {
        super("Banana", Color.YELLOW, origin);
    }

    @Override
    public Fruit setName(String name) {
        name = new StringBuilder(name).reverse().toString();
        return super.setName(name);
    }
}
