package sandbox.workspace.dyma.Chap05;

public class Fruit {

    private String name;
    private String color;
    private String origin;

    public Fruit(String name, String color, String origin) {
        this.name = name;
        this.color = color;
        this.origin = origin;
    }

    public String toString() {
        return String.format("Name: %s,\nColor: %s,\nOrigin: %s", name, color, origin);
    }
}
