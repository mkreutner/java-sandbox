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

    public String getName() {
        return this.name;
    }

    public Fruit setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public Fruit setColor(String color) {
        this.color = color;
        return this;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Fruit setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String toString() {
        return String.format("Name: %s,\nColor: %s,\nOrigin: %s", name, color, origin);
    }

    /**
     * Return true if fruit is produced in Fance
     * @return boolean
     */
    public boolean isFrench() {
        return this.origin == Origin.FRA;
    }
}
