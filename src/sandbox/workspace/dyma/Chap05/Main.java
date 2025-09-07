package sandbox.workspace.dyma.Chap05;

import sandbox.workspace.dyma.Chap05.Fruit;
import sandbox.workspace.dyma.Chap05.Color;
import sandbox.workspace.dyma.Chap05.Origin;

public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Strawberry", Color.RED, Origin.FRA);

        System.out.println(fruit.toString());
    }
}
