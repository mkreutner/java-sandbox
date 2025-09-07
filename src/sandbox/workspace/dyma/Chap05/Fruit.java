package sandbox.workspace.dyma.Chap05;

import sandbox.workspace.dyma.Chap05.Color;
import sandbox.workspace.dyma.Chap05.Origin;

public class Fruit {

    private String name;
    private String color;
    private String origin;

    public Fruit(String name, String color, String origin) {
        this.name = name;
        this.color = color;
        this.origin = origin;
    }

    public Fruit(String name) {
        this.name = name;
        this.color = Color.UNKNOWN;
        this.origin = Origin.UNKNOWN;
    }

    public String toString() {
        return String.format("Name: %s,\nColor: %s,\nOrigin: %s", name, color, origin);
    }
}
