package sandbox.workspace.dyma.Chap06;

public class Fruit {

    //#region Private members
    private String name;
    private String color;
    private String origin;
    //#endregion

    //#region Constructors
    public Fruit() {
        this.name = "Doe";
        this.color = "Transparent";
        this.origin = "Unknown origin";
    }

    public Fruit(String name, String color, String origin) {
        this.name = name;
        this.color = color;
        this.origin = origin;
    }
    //#endregion

    //#region Getters
    /**
     * Returns name of the fruit
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns color of the fruit
     * @return String
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Return origin of the fruit
     * @return String
     */
    public String getOrigin() {
        return this.origin;
    }
    //#endregion

    //#region Setters
    /**
     * Set the name of the fruit
     * @param String name
     * @return the fruit
     */
    public Fruit setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Set the color of the fruit
     * @param String color
     * @return the fruit
     */
    public Fruit setColor(String color) {
        this.color = color;
        return this;
    }
    /**
     * Set the origin of the fruit
     * @param String origin
     * @return the fruits
     */
    public Fruit setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    //#endregion

    //#region Compare methods
    /**
     * Overide equals method from Object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Fruit f = (Fruit) o;

        if (!name.equals(f.name)
            || !color.equals(f.color)
            || !origin.equals(f.origin)) {
            return false;
        }

        return true;
    }

    /**
     * Overide hashCode method from Object
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        
        return result;
    }
    //#endregion
}
